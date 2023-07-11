SUMMARY = "GLIB 2.0 Main Loop wrapper for PulseAudio"
DESCRIPTION = "pulseaudio is a networked sound server for Linux and other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND). \
 \
This package contains the GLIB Main Loop bindings for the PulseAudio \
sound server."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "16.1"

RPM_NAME = "libpulse-mainloop-glib0-16.1-4.1.aarch64.rpm"
RPM_HASH = "172884d536ca1b272140582c1613227f409334378a3ed1e9b1da6cee1ceb57c3776eb7dd54080ac54ae276d437a0b1106892cc94e7dfa8d305ae8ba34fd44d7f"

RPROVIDES:${PN} += "libpulse-mainloop-glib.so.0 \
libpulse-mainloop-glib0 \
pulseaudio-libs-glib2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libpulsecommon-16.1.so"

inherit rpm
