SUMMARY = "Library for Extracting, Verifying, and Fixing Audio Tracks from CDs"
DESCRIPTION = "This CDDA reader distribution ('cdparanoia') reads audio from the \
CD-ROM directly as data and writes the data to a file or pipe as .wav, \
.aifc, or raw 16-bit linear PCM."
LICENSE = "LGPL-2.1-or-later"

PV = "3.10.2"

RPM_NAME = "libcdda_paranoia0-3.10.2-28.20.aarch64.rpm"
RPM_HASH = "3c99b0b85919535651837c5c0cb3edd9a463e449971f520a892f0ca9ef8b18b9c17c832f81b1db40ef4f12dae2166cd169b5573e9205263f6f4a073c0e32b704"

RPROVIDES:${PN} += "libcdda-paranoia.so.0 \
libcdda-paranoia0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdda-interface.so.0"

inherit rpm
