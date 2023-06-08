SUMMARY = "Helper for executing preferred application based on user preferences"
DESCRIPTION = "This package contains a default helper and configuration application utility \
for libalternatives. libalternatives is a helper that executes an application \
based on preferences of a user, system admin or package maintainer, in this \
order of preference. This is accomplished with only the help of config files \
and without the need to maintain system symlinks states."
LICENSE = "Apache-2.0"

PV = "1.2+30.a5431e9"

RPM_NAME = "alts-1.2+30.a5431e9-1.1.aarch64.rpm"
RPM_HASH = "42b958cb164c1a930dc58e3030eaf9ac982b6cae88cef7ee5e10a5db3d5f5fee150be8ebd4a64dc713d2fe97e5d399411b99f1853597c7a5639fa2c9c3688324"

RPROVIDES:${PN} += "alts alts(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libalternatives.so.1()(64bit) libalternatives.so.1(ALTS_1)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
