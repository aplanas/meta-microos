SUMMARY = "LIRC module for PulseAudio"
DESCRIPTION = "pulseaudio is a networked sound server for Linux and other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND). \
 \
This package provides support for IR and RF remotes."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "16.1"

RPM_NAME = "pulseaudio-module-lirc-16.1-3.1.aarch64.rpm"
RPM_HASH = "5bf3e3ebccf36cab0caabb56c72a5a725a0a5d1bdd31ac81b905b4911c1810620d21230f595fddc78372d1743ac7d4d97844ff6445d458adb68dfe30c21d78a5"

RPROVIDES:${PN} += "pulseaudio-module-lirc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblirc-client.so.0 \
libpulsecommon-16.1.so \
libpulsecore-16.1.so \
pulseaudio"

inherit rpm
