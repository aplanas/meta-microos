SUMMARY = "Library for Extracting, Verifying, and Fixing Audio Tracks from CDs"
DESCRIPTION = "This CDDA reader distribution ('cdparanoia') reads audio from the \
CD-ROM directly as data and writes the data to a file or pipe as .wav, \
.aifc, or raw 16-bit linear PCM."
LICENSE = "LGPL-2.1-or-later"

PV = "3.10.2"

RPM_NAME = "libcdda_interface0-3.10.2-28.20.aarch64.rpm"
RPM_HASH = "f99c12e92d851643aa98b0ef4668b46f63edf06dffe20f07f842ad9ab34b77bc6a1dd338ccf8cdd612ce41447ff33f45dd709ce46dd52081aebaa300e16e2b14"

RPROVIDES:${PN} += "libcdda-interface.so.0 \
libcdda-interface0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
