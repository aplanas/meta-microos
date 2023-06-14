SUMMARY = "Utility library of rapidyaml"
DESCRIPTION = "ryml is a C++ library to parse and emit YAML."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "libc4core0_1_11-0.5.0-1.3.aarch64.rpm"
RPM_HASH = "0ab1c26a5ab77418444f36361a141a888003824978b3a359556529055fc3e9b268b46bd8d131126e9e37b6001d913b523dc96b8ac30ef0ba6b794e38a82f3624"

RPROVIDES:${PN} += "libc4core.so.0.1.11 \
libc4core0-1-11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
