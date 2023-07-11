SUMMARY = "Zeroconf module for PulseAudio"
DESCRIPTION = "pulseaudio is a networked sound server for Linux and other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND). \
 \
This package provides zeroconf network support for the PulseAudio sound server"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "16.1"

RPM_NAME = "pulseaudio-module-zeroconf-16.1-4.1.aarch64.rpm"
RPM_HASH = "87b59c0252c7f7f6454f2aab4fead29872d464b6bd7456aa25e3996a1be0675b5c835e516cc5fd509113dd5ac582044015ad7f1deff80fd643cc3b5cb40d819e"

RPROVIDES:${PN} += "libavahi-wrap.so \
libraop.so \
pulseaudio-module-zeroconf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libcrypto.so.3 \
libdbus-1.so.3 \
libprotocol-native.so \
libpulse.so.0 \
libpulsecommon-16.1.so \
libpulsecore-16.1.so \
librtp.so \
pulseaudio"

inherit rpm
