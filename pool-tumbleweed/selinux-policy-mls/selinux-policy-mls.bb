SUMMARY = "SELinux mls base policy"
DESCRIPTION = "SELinux Reference policy mls base module."
LICENSE = "GPL-2.0-or-later"

PV = "20230728"

RPM_NAME = "selinux-policy-mls-20230728-1.1.noarch.rpm"
RPM_HASH = "c76cc0751c6b43710fdeeddafe2d074d91fc18cef703d58e39420736db8463d74ec5a1acb645173ce7011fd3b798383b4bd18835624b77e4270a055c06741635"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-selinux-policy-mls \
selinux-policy-base \
selinux-policy-mls"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
policycoreutils \
policycoreutils-newrole \
selinux-policy \
setransd"

inherit rpm
