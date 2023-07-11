SUMMARY = "SELinux mls base policy"
DESCRIPTION = "SELinux Reference policy mls base module."
LICENSE = "GPL-2.0-or-later"

PV = "20230622"

RPM_NAME = "selinux-policy-mls-20230622-1.1.noarch.rpm"
RPM_HASH = "d6184f394a43bba57baec7242370ce2ced5c9e12deafc3da70604b1bdf6db470d3062920a9cecc394f921c3989b520ccee88c7d71e50b0309317527ae43f2509"
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
