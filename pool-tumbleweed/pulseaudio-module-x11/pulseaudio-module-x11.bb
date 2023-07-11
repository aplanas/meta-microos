SUMMARY = "X11 module for PulseAudio"
DESCRIPTION = "pulseaudio is a networked sound server for Linux and other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND). \
 \
This package provides the components needed to automatically start \
the PulseAudio sound server on X11 startup."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "16.1"

RPM_NAME = "pulseaudio-module-x11-16.1-4.1.aarch64.rpm"
RPM_HASH = "26fe6e28b02ce86deb786430a75a663f75e546a8527643d2c526a2f734eb2eb172cc6386312bbd50b18ba3af898da028d2fea511a687ae84c29331873e2b996a"

RPROVIDES:${PN} += "pulseaudio-module-x11"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libXtst.so.6 \
libc.so.6 \
libprotocol-native.so \
libpulse.so.0 \
libpulsecommon-16.1.so \
libpulsecore-16.1.so \
libxcb.so.1 \
pulseaudio \
pulseaudio-utils"

inherit rpm
