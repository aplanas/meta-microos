SUMMARY = "Library That Allows Access to Smart Cards (Chipcards)"
DESCRIPTION = "Libchipcard allows access to smart cards. It provides basic access \
to memory and processor cards and has special support for German \
medical cards, German 'Geldkarten,' and HBCI (home banking) cards (both \
type 0 and type 1). It accesses the readers via CTAPI or PC/SC \
interfaces and has successfully been tested with Towitoko, Kobil, and \
Reiner-SCT readers."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.6"

RPM_NAME = "libchipcard-5.1.6-1.12.aarch64.rpm"
RPM_HASH = "c7b8c3a59519c5734cc257be56060911c8c2be101124208e3064088b10a6bcb81242786b0fda8e7d9c69cce70364858ac17d43a35d1a2f1c02924b4bb48be203"

RPROVIDES:${PN} += "config-libchipcard \
libchipcard"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libchipcard.so.6 \
libgcc-s.so.1 \
libgwenhywfar.so.79 \
libstdc++.so.6"

inherit rpm
