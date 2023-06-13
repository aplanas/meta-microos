SUMMARY = "Runtime for libalternatives"
DESCRIPTION = "This package contains the core logic and the runtime library for \
libalternatives. libalternatives is a helper that executes an application based \
on preferences of a user, system admin or package maintainer, in this order of \
preference. This is accomplished with only the help of config files and \
without the need to maintain system symlinks states."
LICENSE = "Apache-2.0"

PV = "1.2+30.a5431e9"

RPM_NAME = "libalternatives1-1.2+30.a5431e9-1.1.aarch64.rpm"
RPM_HASH = "a57c649954c8b6d73e84f7c471ddb67519de2c4d0f4d54cf7665be36b050f90a67cc6d88e47a67598fd89c08259d097c29c42ea9f531d91e5a103c38bd785990"

RPROVIDES:${PN} += "libalternatives.so.1()(64bit) \
libalternatives.so.1(ALTS_1)(64bit) \
libalternatives1 \
libalternatives1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
