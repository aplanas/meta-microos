SUMMARY = "SELinux minimum base policy"
DESCRIPTION = "SELinux Reference policy minimum base module."
LICENSE = "GPL-2.0-or-later"

PV = "20230622"

RPM_NAME = "selinux-policy-minimum-20230622-1.1.noarch.rpm"
RPM_HASH = "12a11f246771d2cc5653f6f821bea890e1df033005b6c0bd3c6b93297bf5890189dfd67c326b91966292a6f5d0f634b08ea60189dddd8351eec962f3755c2ba2"
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
