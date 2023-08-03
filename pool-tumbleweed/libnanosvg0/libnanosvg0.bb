SUMMARY = "Simple SVG parse"
DESCRIPTION = "Shared library built from the code in the nanosvg.h header file \
 \
A simple SVG parser. The output of the parser is a list of cubic bezier shapes."
LICENSE = "Zlib"

PV = "2022.12.22"

RPM_NAME = "libnanosvg0-2022.12.22-1.1.aarch64.rpm"
RPM_HASH = "aabeda40f9a9498562e36a66cd2eec09ba92180c8aed3ef747cff11abf4734d0c6a476e664e4f3c5371592f52a3c3e0c98bdb28508630fc792a5729e9b191a79"

RPROVIDES:${PN} += "libnanosvg.so.0 \
libnanosvg0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
