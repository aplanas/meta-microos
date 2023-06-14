SUMMARY = "Zeroconf module for PulseAudio"
DESCRIPTION = "pulseaudio is a networked sound server for Linux and other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND). \
 \
This package provides zeroconf network support for the PulseAudio sound server"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "16.1"

RPM_NAME = "pulseaudio-module-zeroconf-16.1-3.1.aarch64.rpm"
RPM_HASH = "0cf43c1aa470b941eec897079759aaa1a402c989dfba42df456b0e2e1a96092e09b3e9d347c72a5090e33fa174899b58360eb1eb57df4ed64e6c5a9847fc77d2"

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
