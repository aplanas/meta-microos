SUMMARY = "GSettings module for PulseAudio"
DESCRIPTION = "pulseaudio is a networked sound server for Linux and other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND). \
 \
This package provides GSettings storage of PulseAudio sound server settings."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "16.1"

RPM_NAME = "pulseaudio-module-gsettings-16.1-3.1.aarch64.rpm"
RPM_HASH = "a094a81ffff17b87a82f7406b5720e8b214ee5f8c5c03e1a56185232827ecd95563232679c06e35beb3791d6d173a650cbcfb8148036128b5a2d5486ec1d9d50"

RPROVIDES:${PN} += "pulseaudio-module-gsettings"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpulsecommon-16.1.so \
libpulsecore-16.1.so \
pulseaudio"

inherit rpm
