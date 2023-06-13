SUMMARY = "SELinux mls base policy"
DESCRIPTION = "SELinux Reference policy mls base module."
LICENSE = "GPL-2.0-or-later"

PV = "20230425"

RPM_NAME = "selinux-policy-mls-20230425-1.1.noarch.rpm"
RPM_HASH = "15aaae33ffed21865eca5c9ad7616fb6cf65126f16d4c59a71c7cf20b89c026e5a38e0fb97c1ae2836b8675ec7891dd0631c2415797529b19af3444675494235"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(selinux-policy-mls) \
selinux-policy-base \
selinux-policy-mls"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
policycoreutils \
policycoreutils-newrole \
selinux-policy \
setransd"

inherit rpm
