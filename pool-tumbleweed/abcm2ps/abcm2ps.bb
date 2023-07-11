SUMMARY = "A program to typeset abc tunes into Postscript"
DESCRIPTION = "abcm2ps is a package which converts music tunes from ABC format to \
PostScript. Based on abc2ps version 1.2.5, it was developed mainly to print \
barock organ scores which have independent voices played on one or many \
keyboards and a pedal board. abcm2ps introduces many extensions to the ABC \
language that make it suitable for classical music."
LICENSE = "LGPL-3.0-or-later"

PV = "8.14.14"

RPM_NAME = "abcm2ps-8.14.14-1.4.aarch64.rpm"
RPM_HASH = "a71b7c9de0bd6cdb2697d1725ef042e9d32e0fab5c3e739663ced14fe4a1ca40f8cc026732dbcb900283c701678d1b4fd8845eeadeafa2e6a4415e29400326b0"

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
