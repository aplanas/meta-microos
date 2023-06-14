SUMMARY = "Header files for nng"
DESCRIPTION = "Development and header files for nng (nanomsg next-generation)."
LICENSE = "MIT"

PV = "1.5.2"

RPM_NAME = "nng-devel-1.5.2-1.8.aarch64.rpm"
RPM_HASH = "9ebc1b3225459881a7601a9dc93af249191f74b183f4d23812e019fc3d21bd8d84410a4b1d65e5d7e2948def817f3fd90744e062df951886464c0f066f0ee219"

RPROVIDES:${PN} += "cmake-nng \
nng-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnng.so.1 \
libnng1"

inherit rpm
