SUMMARY = "A Program for Extracting, Verifying, and Fixing Audio Tracks from CDs"
DESCRIPTION = "This CDDA reader distribution ('cdparanoia') reads audio from the \
CD-ROM directly as data and writes the data to a file or pipe as .wav, \
.aifc, or raw 16-bit linear PCM."
LICENSE = "GPL-2.0-or-later"

PV = "3.10.2"

RPM_NAME = "cdparanoia-3.10.2-28.19.aarch64.rpm"
RPM_HASH = "6727f899d3df480ebddfa010374a6aae9405ea3b11eeda87db7320ef130797857eb6737e9782059dc82199e807f703c87d096cb6666e581f051ca5eef29820b4"

RPROVIDES:${PN} += "cdparano \
cdparanoia"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdda-interface.so.0 \
libcdda-paranoia.so.0 \
libm.so.6"

inherit rpm
