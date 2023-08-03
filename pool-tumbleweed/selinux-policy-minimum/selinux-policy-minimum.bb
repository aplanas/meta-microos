SUMMARY = "SELinux minimum base policy"
DESCRIPTION = "SELinux Reference policy minimum base module."
LICENSE = "GPL-2.0-or-later"

PV = "20230728"

RPM_NAME = "selinux-policy-minimum-20230728-1.1.noarch.rpm"
RPM_HASH = "ac5b094303ffafc8aa211b3d7e119e3a03f5bf5b95cc41660d95a99457949745d0cca7853b87073f76503d2c37a0668df81b69e68e623e973149befe1231a3cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-selinux-policy-minimum \
selinux-policy-base \
selinux-policy-minimum"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/sh \
coreutils \
policycoreutils \
policycoreutils-python-utils \
selinux-policy"

inherit rpm
