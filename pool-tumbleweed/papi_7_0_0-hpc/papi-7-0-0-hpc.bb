SUMMARY = "Performance Application Programming Interface"
DESCRIPTION = " \
PAPI aims to provide the tool designer and application engineer with a \
consistent interface and methodology for use of the performance counter \
hardware found in most major microprocessors. PAPI enables software \
engineers to see, in near real time, the relation between software \
performance and processor events."
LICENSE = "BSD-3-Clause"

PV = "7.0.0"

RPM_NAME = "papi_7_0_0-hpc-7.0.0-1.3.aarch64.rpm"
RPM_HASH = "f968edfd24821a2193487726784c5bc8ca28bb44332d505a882950e987b4a8285be767116f8216cd5211e91bb991ff34871f58c0bc8a3d2cce3c3f488aba0c63"

RPROVIDES:${PN} += "papi-7-0-0-hpc"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpapi-7-0-0-hpc \
lua-lmod"

inherit rpm
