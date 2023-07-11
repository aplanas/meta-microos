SUMMARY = "Development files for OpenFST"
DESCRIPTION = "OpenFST is a library for constructing, combining, optimizing and \
searching weighted finite-state transducers (FSTs). \
 \
This package requires SSE on 32-bit x86 to function."
LICENSE = "Apache-2.0"

PV = "1.8.2"

RPM_NAME = "libfst25-1.8.2-1.2.aarch64.rpm"
RPM_HASH = "da8f3696f9ae609415053c271a135bb65405dff775822bed6f5e5e2d900bffe16f9ff7fa0a7cd0b6601eb66188bca96975f07308b64e286b450a8e6c421d3f23"

RPROVIDES:${PN} += "libfst.so.25 \
libfst25 \
libfstscript.so.25"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
