SUMMARY = "An implementation of the Unicode BiDi algorithm"
DESCRIPTION = "This library implements the algorithm as described in 'Unicode \
Standard Annex #9, the Bidirectional Algorithm'."
LICENSE = "LGPL-2.1-only"

PV = "1.0.13"

RPM_NAME = "fribidi-1.0.13-1.1.aarch64.rpm"
RPM_HASH = "b1b32403e028ced3ad984d922b5aa8ffa24a055db2be2adaf2f346b6aba84671239bc8aac8decbe5e6504480275ebd829eb7780d2a3d8b57187010abc80dd3b3"

RPROVIDES:${PN} += "fribidi \
locale-ar;he"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfribidi.so.0"

inherit rpm
