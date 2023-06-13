SUMMARY = "Graphic Converter"
DESCRIPTION = "TransFig is a set of tools for creating TeX documents with graphics \
that are portable in the sense that they can be printed in a wide \
variety of environments. \
 \
The transfig directory contains the source for the transfig command \
which generates a Makefile which translates Fig code to various \
graphics description languages using the fig2dev program.  In previous \
releases, this command was implemented as a shell script."
LICENSE = "MIT"

PV = "3.2.8b"

RPM_NAME = "transfig-3.2.8b-4.2.aarch64.rpm"
RPM_HASH = "08f1e9cb0a73a1fdc7a3f449263f4fad5fd3ae32e6b75e74a6347d7d5f09e956cebf28f162b519ae3c155367097ee75c47774624e5165b86fa71b222c4b22d25"

RPROVIDES:${PN} += "fig2dev \
transfig \
transfig(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libz.so.1()(64bit) \
netpbm"

inherit rpm
