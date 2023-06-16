SUMMARY = "X11 module for PulseAudio"
DESCRIPTION = "pulseaudio is a networked sound server for Linux and other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND). \
 \
This package provides the components needed to automatically start \
the PulseAudio sound server on X11 startup."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "16.1"

RPM_NAME = "pulseaudio-module-x11-16.1-3.1.aarch64.rpm"
RPM_HASH = "be0105053cda162326aa3d5577ce224ee00bee2d1131eeadb017a029e16c3f3d9bc753a36e4e4c80504cab86e2016b6e2f8d202bcfbcbbdc84152fd9a3f1da45"

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
