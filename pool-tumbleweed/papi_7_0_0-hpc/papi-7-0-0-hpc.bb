SUMMARY = "Performance Application Programming Interface"
DESCRIPTION = " \
PAPI aims to provide the tool designer and application engineer with a \
consistent interface and methodology for use of the performance counter \
hardware found in most major microprocessors. PAPI enables software \
engineers to see, in near real time, the relation between software \
performance and processor events."
LICENSE = "BSD-3-Clause"

PV = "7.0.0"

RPM_NAME = "papi_7_0_0-hpc-7.0.0-1.4.aarch64.rpm"
RPM_HASH = "0948f9bf52de61e299443340d66461664962c2e6e7d345e1a68993deb2992ccc299bea087633d4345f432d69690f882df3791150d0723fd78c5e127f14df34ed"

RPROVIDES:${PN} += "papi-7-0-0-hpc"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpapi-7-0-0-hpc \
lua-lmod"

inherit rpm
