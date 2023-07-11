SUMMARY = "PAPI runtime library"
DESCRIPTION = "This package contains the PAPI runtime library."
LICENSE = "BSD-3-Clause"

PV = "7.0.0"

RPM_NAME = "libpapi_7_0_0-hpc-7.0.0-1.4.aarch64.rpm"
RPM_HASH = "4c413f046377fcb721a7ce12211a7dc5c578da8bc2ebcb8240abebc34755c663057ee49ee11456fb9ee5d31e4e714a4577718fc8d285e70db1c24a4184cafd0d"

RPROVIDES:${PN} += "libpapi-7-0-0-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpfm.so.4"

inherit rpm
