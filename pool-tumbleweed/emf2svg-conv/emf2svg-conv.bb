SUMMARY = "EMF to SVG converter"
DESCRIPTION = "Tool to convert files in EMF format to SVG"
LICENSE = "GPL-2.0-only"

PV = "1.1.0"

RPM_NAME = "emf2svg-conv-1.1.0-2.13.aarch64.rpm"
RPM_HASH = "9c8d4ee232c07dea65fbce9696109bf012f943887cddba4bb0d7eedeab58742c45af062381bdef38fe8bab87b1d770dca28e7b529e292415ed8615bf6903403c"

RPROVIDES:${PN} += "emf2svg-conv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libemf2svg.so.1 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
