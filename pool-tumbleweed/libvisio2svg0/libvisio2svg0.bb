SUMMARY = "Library to convert Visio Documents and Stencils (VSS and VSD) to SVG"
DESCRIPTION = "Library for conversion of Visio Documents and Stencils (VSS and VSD) to SVG. \
It can be used for conversion of standalone EMF files, but \
more typically for files embedded in other file formats, e.g. \
Visio drawings."
LICENSE = "GPL-2.0-only"

PV = "0.5.5"

RPM_NAME = "libvisio2svg0-0.5.5-3.13.aarch64.rpm"
RPM_HASH = "63766ece19ab4ec523f5165e5214c1303e6aeac76b7496507db56b0ad19222dac6c3628e74e716e892ca2748d9bcf62cbd8b402077f7c36d08b9339048755916"

RPROVIDES:${PN} += "libTitleGenerator.so.0()(64bit) \
libVisio2Svg.so.0()(64bit) \
libvisio2svg0 \
libvisio2svg0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libemf2svg.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
librevenge-0.0.so.0()(64bit) \
librevenge-stream-0.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libvisio-0.1.so.1()(64bit) \
libwmf-0.2.so.7()(64bit) \
libwmflite-0.2.so.7()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
