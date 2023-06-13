SUMMARY = "GLIB 2.0 Main Loop wrapper for PulseAudio"
DESCRIPTION = "pulseaudio is a networked sound server for Linux and other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND). \
 \
This package contains the GLIB Main Loop bindings for the PulseAudio \
sound server."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "16.1"

RPM_NAME = "libpulse-mainloop-glib0-16.1-3.1.aarch64.rpm"
RPM_HASH = "dbad00d3ae7115a3769f43e6193c662e0a46ab9331181c65cd1aa2662afa7f4987d89a8e424dff054dfc102aef683b05e06758f3924df22d631f02c48e20d109"

RPROVIDES:${PN} += "libpulse-mainloop-glib.so.0()(64bit) \
libpulse-mainloop-glib.so.0(PULSE_0)(64bit) \
libpulse-mainloop-glib0 \
libpulse-mainloop-glib0(aarch-64) \
pulseaudio-libs-glib2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libpulsecommon-16.1.so()(64bit)"

inherit rpm
