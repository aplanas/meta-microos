SUMMARY = "Unicode line-breaking library"
DESCRIPTION = "Libunibreak is an implementation of the line breaking and word breaking \
algorithm as described in Unicode Standard Annex 14 and Unicode Standard \
Annex 29."
LICENSE = "Zlib"

PV = "5.0"

RPM_NAME = "libunibreak5-5.0-1.6.aarch64.rpm"
RPM_HASH = "6691f7163cb762cf8c0dcd2da3ab453c341cd313f105de1fc7c31a7164370fa211c59b9189c8c6399873c07d92ff345017307da4307f1513861449fe3ce5e60c"

RPROVIDES:${PN} += "libunibreak.so.5 \
libunibreak5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
