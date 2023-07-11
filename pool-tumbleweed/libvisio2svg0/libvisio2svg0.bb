SUMMARY = "Library to convert Visio Documents and Stencils (VSS and VSD) to SVG"
DESCRIPTION = "Library for conversion of Visio Documents and Stencils (VSS and VSD) to SVG. \
It can be used for conversion of standalone EMF files, but \
more typically for files embedded in other file formats, e.g. \
Visio drawings."
LICENSE = "GPL-2.0-only"

PV = "0.5.5"

RPM_NAME = "libvisio2svg0-0.5.5-3.14.aarch64.rpm"
RPM_HASH = "c24ac26d232eb6933a3e4417d7cda09181d6cb320f8ea6cdeb90ca7279d5f01657ce70c6a99c08d0f2790c0ba9fa2f1b9852f58c60df81d8c982a8a1cb72aa9e"

RPROVIDES:${PN} += "libTitleGenerator.so.0 \
libVisio2Svg.so.0 \
libvisio2svg0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libemf2svg.so.1 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libstdc++.so.6 \
libvisio-0.1.so.1 \
libwmf-0.2.so.7 \
libwmflite-0.2.so.7 \
libxml2.so.2"

inherit rpm
