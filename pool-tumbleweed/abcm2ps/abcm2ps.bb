SUMMARY = "A program to typeset abc tunes into Postscript"
DESCRIPTION = "abcm2ps is a package which converts music tunes from ABC format to \
PostScript. Based on abc2ps version 1.2.5, it was developed mainly to print \
barock organ scores which have independent voices played on one or many \
keyboards and a pedal board. abcm2ps introduces many extensions to the ABC \
language that make it suitable for classical music."
LICENSE = "LGPL-3.0-or-later"

PV = "8.14.14"

RPM_NAME = "abcm2ps-8.14.14-1.3.aarch64.rpm"
RPM_HASH = "098358fb7582c49408ca768d2b71ac2304e9cbde5b47e3fb2532f60b55c3dfa32de0a04d22f01e501d6d228beaf25c78740bc2e2f6e456150fb59c173e027cd6"

RPROVIDES:${PN} += "abcm2ps"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libglib-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0"

inherit rpm
