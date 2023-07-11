SUMMARY = "SELinux policy core policy devel utilities"
DESCRIPTION = "The policycoreutils-devel package contains the management tools use to develop policy in an SELinux environment."
LICENSE = "GPL-2.0-or-later"

PV = "3.5"

RPM_NAME = "policycoreutils-devel-3.5-4.1.aarch64.rpm"
RPM_HASH = "451ea664c6c7f444a894fc4f3557dbe439a8db9e7cad8dd7f2e080e41877eda1fe969a55ee3aa73ebd584b7dc77454abaacbcb80e904f7bfdde94c7baa20d382"

RPROVIDES:${PN} += "policycoreutils-devel"

RDEPENDS:${PN} += "/usr/bin/make \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libselinux.so.1 \
python3-distro \
python3-policycoreutils"

inherit rpm
