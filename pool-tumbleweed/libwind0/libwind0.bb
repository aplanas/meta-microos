SUMMARY = "An implementation of RFC 3454 (stringprep)"
DESCRIPTION = "This package contains an implementation of the stringprep library."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libwind0-7.8.0-3.1.aarch64.rpm"
RPM_HASH = "5558d19e8f0bb2c0edbd00abe145c14e28fc2a73271fc58f30b4701e35cba805b3258134832f7639f90cd0805bc1ea7b08f843216751934ee959e1bd2c3c2266"

RPROVIDES:${PN} += "libwind.so.0()(64bit) \
libwind.so.0(HEIMDAL_WIND_1.0)(64bit) \
libwind0 \
libwind0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcom_err.so.2()(64bit)"

inherit rpm
