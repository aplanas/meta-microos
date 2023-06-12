SUMMARY = "Library for Extracting, Verifying, and Fixing Audio Tracks from CDs"
DESCRIPTION = "This CDDA reader distribution ('cdparanoia') reads audio from the \
CD-ROM directly as data and writes the data to a file or pipe as .wav, \
.aifc, or raw 16-bit linear PCM."
LICENSE = "LGPL-2.1-or-later"

PV = "3.10.2"

RPM_NAME = "libcdda_paranoia0-3.10.2-28.19.aarch64.rpm"
RPM_HASH = "22d953c2b57defe517c690f383596c350fc36e6296635ad106824bb59b7695fe77d50750d6635ad7b6a814a6684ffeadf1e45e9cbd4bc04ba2a3a979244e859b"

RPROVIDES:${PN} += "libcdda_paranoia.so.0()(64bit) \
libcdda_paranoia0 \
libcdda_paranoia0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcdda_interface.so.0()(64bit)"

inherit rpm
