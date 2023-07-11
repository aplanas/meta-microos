SUMMARY = "A Networked Sound Server"
DESCRIPTION = "pulseaudio is a networked sound server for Linux, other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "16.1"

RPM_NAME = "pulseaudio-16.1-4.1.aarch64.rpm"
RPM_HASH = "1aeb76cd07df74e8a754c070aac5eddf847c2aeb43645254ff99d9a789aaf2b0f5deefac5f9ad66e5adc044f9c82e63b481c39dc950bb51e847381ee687cddec"

RPROVIDES:${PN} += "config-pulseaudio \
libalsa-util.so \
libcli.so \
liboss-util.so \
libprotocol-cli.so \
libprotocol-http.so \
libprotocol-native.so \
libprotocol-simple.so \
libpulsecore-16.1.so \
libpulsecore7 \
libpulsecore9 \
librtp.so \
libwebrtc-util.so \
pulseaudio \
pulseaudio-daemon"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11-xcb.so.1 \
libX11.so.6 \
libasound.so.2 \
libc.so.6 \
libcap.so.2 \
libdbus-1.so.3 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libltdl.so.7 \
libm.so.6 \
liborc-0-4-0 \
liborc-0.4.so.0 \
libpulse.so.0 \
libpulsecommon-16.1.so \
libsndfile.so.1 \
libsoxr.so.0 \
libspeexdsp.so.1 \
libstdc++.so.6 \
libsystemd.so.0 \
libtdb.so.1 \
libudev.so.1 \
libwebrtc-audio-processing.so.1 \
libxcb.so.1 \
pulseaudio-setup \
rtkit \
udev \
user-pulse"

inherit rpm
