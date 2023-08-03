SUMMARY = "SELinux targeted base policy"
DESCRIPTION = "SELinux Reference policy targeted base module."
LICENSE = "GPL-2.0-or-later"

PV = "20230728"

RPM_NAME = "selinux-policy-targeted-20230728-1.1.noarch.rpm"
RPM_HASH = "d42e5c39afa0b660535817ab12f628e40f7cbcd3e66292dd3e29eea4e29346912dcb7793d4ba3a7b570cc8b5cecc67443b5c26a3b27e8bafdf6cf85b7824c301"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-selinux-policy-targeted \
selinux-policy-base \
selinux-policy-targeted"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
selinux-policy"

inherit rpm
