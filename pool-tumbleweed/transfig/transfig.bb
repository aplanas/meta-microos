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

RPM_NAME = "transfig-3.2.8b-4.3.aarch64.rpm"
RPM_HASH = "c94e03d546baad51dd7fbe97402900966725da05c57d63eb308db62a041041a35464825ed09d0ff1d79b5573d3eb8bbec5a483736409fd5e0b3bec774decafd8"

RPROVIDES:${PN} += "fig2dev \
transfig"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpng16.so.16 \
libz.so.1 \
netpbm"

inherit rpm
