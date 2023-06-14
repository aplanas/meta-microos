SUMMARY = "A library to import non-HTML reflowable e-book formats"
DESCRIPTION = "libe-book is a library to import non-HTML reflowable e-book formats. \
Currently supported are PalmDoc, TealDoc, Plucker eBook, eReader eBook, \
FictionBook v.2, TCR, zTXT."
LICENSE = "MPL-2.0"

PV = "0.1.3"

RPM_NAME = "libe-book-0_1-1-0.1.3-2.21.aarch64.rpm"
RPM_HASH = "08732b6b947be78fe2dbc18d63a91156eff31a49169e8726ee52447911a40b2a8b2b7fac1ef5ea543def94fd3bf5d8bec45331d4a54faeca48f36cf589f5fca5"

RPROVIDES:${PN} += "libe-book-0-1-1 \
libe-book-0.1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicui18n.so.73 \
libicuuc.so.73 \
liblangtag.so.1 \
librevenge-0.0.so.0 \
libstdc++.so.6 \
libxml2.so.2 \
libz.so.1"

inherit rpm
