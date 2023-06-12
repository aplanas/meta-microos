SUMMARY = "Simplified C Client Interface for PostgreSQL"
DESCRIPTION = "LIBPGEASY is a simplified C interface that hides some of the complexity \
of LIBPQ."
LICENSE = "BSD-3-Clause"

PV = "3.0.4"

RPM_NAME = "libpgeasy3-3.0.4-203.25.aarch64.rpm"
RPM_HASH = "b7490316385aa7bd0e1d1f5f39179a9344051999f3dd775ab7f61c6b57b2103868af69220e1481466def0c6b1a592515ddf4d42494108d119c999b542482f526"

RPROVIDES:${PN} += "libpgeasy \
libpgeasy.so.3()(64bit) \
libpgeasy3 \
libpgeasy3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpq.so.5()(64bit)"

inherit rpm
