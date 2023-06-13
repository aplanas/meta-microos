SUMMARY = "SELinux policies for container runtimes"
DESCRIPTION = "SELinux policy modules for use with container runtimes."
LICENSE = "GPL-2.0-only"

PV = "2.215.0"

RPM_NAME = "container-selinux-2.215.0-1.1.noarch.rpm"
RPM_HASH = "cc741614a3e6347f4f379a08b986368a68bbf2c6df9a096d1b6fa364aa003e2740fc9a699d55a0e95f868197ec263a0c749067b30c0850a204e2c8d7d526fa70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "container-selinux"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/sed \
policycoreutils \
selinux-policy \
selinux-policy-base \
selinux-policy-targeted \
selinux-tools"

inherit rpm
