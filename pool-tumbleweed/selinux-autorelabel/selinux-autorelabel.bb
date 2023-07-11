SUMMARY = "Systemd services to relabel SELinux labels"
DESCRIPTION = "This package contains the systemd target, service files and generator \
to auto-relabel a SELinux system."
LICENSE = "GPL-2.0-only"

PV = "3.1"

RPM_NAME = "selinux-autorelabel-3.1-3.8.noarch.rpm"
RPM_HASH = "4c25be9445ebce763d888f8b7f46d74f3e407e95f8c1c6f8cb9bb1c5e0f953443acdfb676ec25d3682f90aec5c63d1352b68a633948509238dd0dd8a0371cc10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "selinux-autorelabel"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
policycoreutils"

inherit rpm
