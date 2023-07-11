SUMMARY = "SELinux targeted base policy"
DESCRIPTION = "SELinux Reference policy targeted base module."
LICENSE = "GPL-2.0-or-later"

PV = "20230622"

RPM_NAME = "selinux-policy-targeted-20230622-1.1.noarch.rpm"
RPM_HASH = "938c9506166824001cda5a19eab59bd65b6523943d01a7f8cb321044502116b4b9c010859e6e0fe7133eaced5060aa5062eeda0c7642c26d95af1d689247c4b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-selinux-policy-targeted \
selinux-policy-base \
selinux-policy-targeted"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
selinux-policy"

inherit rpm
