SUMMARY = "Systemd services to relabel SELinux labels"
DESCRIPTION = "This package contains the systemd target, service files and generator \
to auto-relabel a SELinux system."
LICENSE = "GPL-2.0-only"

PV = "3.1"

RPM_NAME = "selinux-autorelabel-3.1-3.7.noarch.rpm"
RPM_HASH = "3e70b945cc8044d45683f7f990c503cc255a91a089bbb6b0bf4a4bc1c19cf1306e308b24d638d9baa124dafd7d8f2828ecafe8c9e6444ac4612fd6ca62c984e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "selinux-autorelabel"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
policycoreutils"

inherit rpm
