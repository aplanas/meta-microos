SUMMARY = "Library That Allows Access to Smart Cards (Chipcards)"
DESCRIPTION = "Libchipcard allows access to smart cards. It provides basic access \
to memory and processor cards and has special support for German \
medical cards, German 'Geldkarten,' and HBCI (home banking) cards (both \
type 0 and type 1). It accesses the readers via CTAPI or PC/SC \
interfaces and has successfully been tested with Towitoko, Kobil, and \
Reiner-SCT readers."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.6"

RPM_NAME = "libchipcard-5.1.6-1.11.aarch64.rpm"
RPM_HASH = "5216224ea90891c960fddfe4c3daf91c3e6b992eb30081547b9583d7d3fed736fe769415bef038b24c50a8077ab5920f6d1aa2a60b64e4c651a822be74c8e451"

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
