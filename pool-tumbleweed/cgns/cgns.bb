SUMMARY = "CFD General Notation System"
DESCRIPTION = "The CFD General Notation System (CGNS) provides a general, portable, \
and extensible standard for the storage and retrieval of computational \
fluid dynamics (CFD) analysis data."
LICENSE = "Zlib"

PV = "4.3.0"

RPM_NAME = "cgns-4.3.0-1.8.aarch64.rpm"
RPM_HASH = "dac772739733ff6d0f82939e40d62d348e56ebd6a2e29e9d31d9c94a78687b1bee2effc439f337447b5d35065c5d27e92b750b9d7a707e87ad3a699a6e000177"

RPROVIDES:${PN} += "cgns"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcgns.so.4.3"

inherit rpm
