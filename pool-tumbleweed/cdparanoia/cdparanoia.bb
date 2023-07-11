SUMMARY = "A Program for Extracting, Verifying, and Fixing Audio Tracks from CDs"
DESCRIPTION = "This CDDA reader distribution ('cdparanoia') reads audio from the \
CD-ROM directly as data and writes the data to a file or pipe as .wav, \
.aifc, or raw 16-bit linear PCM."
LICENSE = "GPL-2.0-or-later"

PV = "3.10.2"

RPM_NAME = "cdparanoia-3.10.2-28.20.aarch64.rpm"
RPM_HASH = "f2f0695fbdabf0af067337aed5441efcb0225a4931648a473391dcf177a152fd7cd11d874fd220e9005f2658c6ea6162014c9b8d0e1c386fc35ef6b81ba223d0"

RPROVIDES:${PN} += "cdparano \
cdparanoia"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdda-interface.so.0 \
libcdda-paranoia.so.0 \
libm.so.6"

inherit rpm
