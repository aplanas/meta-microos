SUMMARY = "Header files for nng"
DESCRIPTION = "Development and header files for nng (nanomsg next-generation)."
LICENSE = "MIT"

PV = "1.5.2"

RPM_NAME = "nng-devel-1.5.2-1.9.aarch64.rpm"
RPM_HASH = "2d2d23d17c5694e2bb3f3192c31e8af544e7069a13d93bda7cf1153a1469b6999e38891f443abb725f9f880512290e46c3aafb35713f79879b3cc89291a977c7"

RPROVIDES:${PN} += "cmake-nng \
nng-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnng.so.1 \
libnng1"

inherit rpm
