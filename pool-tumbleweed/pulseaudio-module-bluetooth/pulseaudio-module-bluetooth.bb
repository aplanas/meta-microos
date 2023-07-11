SUMMARY = "Bluetooth support for the PulseAudio sound server"
DESCRIPTION = "pulseaudio is a networked sound server for Linux and other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND). \
 \
Contains Bluetooth audio (A2DP/HSP/HFP) support for the PulseAudio sound server."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "16.1"

RPM_NAME = "pulseaudio-module-bluetooth-16.1-4.1.aarch64.rpm"
RPM_HASH = "460e68431d6a19492c2d2ad57efeee3ff6c52010768b15f513e2e6ed87ac2cb841a71c4e740701fe5c8d1dda027e8aabaf97e519cdfdc20f71a5a86e770e9797"

RPROVIDES:${PN} += "libbluez5-util.so \
pulseaudio-module-bluetooth"

RDEPENDS:${PN} += "bluez \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstreamer-1.0.so.0 \
libpulse.so.0 \
libpulsecommon-16.1.so \
libpulsecore-16.1.so \
libsbc.so.1 \
pulseaudio"

inherit rpm
