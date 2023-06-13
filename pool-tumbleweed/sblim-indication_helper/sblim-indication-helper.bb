SUMMARY = "Toolkit for CMPI Indication Providers"
DESCRIPTION = "This package contains a developer library for helping out when writing \
CMPI providers. This library polls the registered functions for data \
and, if it changes, a CMPI indication is set with the values of the \
indication class properties (also set by the developer)."
LICENSE = "EPL-1.0"

PV = "0.5.0"

RPM_NAME = "sblim-indication_helper-0.5.0-1.21.aarch64.rpm"
RPM_HASH = "6abe1cfce293fd875dcbcc963f67d831519799e5b29bbfc75de0e688c851ecec91c8324ba127512f8707509e5d64fcc10b86234770fe126d116597015bd000af"

RPROVIDES:${PN} += "libind_helper.so.0()(64bit) \
sblim-indication_helper \
sblim-indication_helper(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
