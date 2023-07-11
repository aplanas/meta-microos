SUMMARY = "Development package for the pulseaudio library"
DESCRIPTION = "pulseaudio is a networked sound server for Linux and other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND). \
 \
This package contains the files needed to compile programs that use the \
pulseaudio library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "16.1"

RPM_NAME = "libpulse-devel-16.1-4.1.aarch64.rpm"
RPM_HASH = "5d5a597b19407e5c75d64dc1b5efb1cfd4efb3598b77d5f3d13a78747b2db1429c239d16a2b8235002ee1b447a132e4965916cdd5fd01ac9f7b1d962f1940022"

RPROVIDES:${PN} += "libpulse-devel \
pkgconfig-libpulse \
pkgconfig-libpulse-mainloop-glib \
pkgconfig-libpulse-simple \
pulseaudio-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpulse-mainloop-glib0 \
libpulse0 \
pkgconfig \
pkgconfig-glib-2.0 \
pkgconfig-libpulse"

inherit rpm
