SUMMARY = "A Networked Sound Server"
DESCRIPTION = "pulseaudio is a networked sound server for Linux, other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "16.1"

RPM_NAME = "pulseaudio-16.1-3.1.aarch64.rpm"
RPM_HASH = "8f5f9015e5030a1fe33d8e2415759e796c642d6c7387a2fa801220efbad86cf1476df0c1ded6a3b552985f8af15dc66008b3265f15fcc51fd8104574dcea7249"

RPROVIDES:${PN} += "config(pulseaudio) \
libalsa-util.so()(64bit) \
libcli.so()(64bit) \
liboss-util.so()(64bit) \
libprotocol-cli.so()(64bit) \
libprotocol-http.so()(64bit) \
libprotocol-native.so()(64bit) \
libprotocol-simple.so()(64bit) \
libpulsecore-16.1.so()(64bit) \
libpulsecore7 \
libpulsecore9 \
librtp.so()(64bit) \
libwebrtc-util.so()(64bit) \
pulseaudio \
pulseaudio(aarch-64) \
pulseaudio-daemon"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11-xcb.so.1()(64bit) \
libX11.so.6()(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libasound.so.2(ALSA_0.9.0rc8)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcap.so.2()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libfftw3f.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstapp-1.0.so.0()(64bit) \
libgstbase-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libltdl.so.7()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
liborc-0.4.so.0()(64bit) \
liborc-0_4-0 \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libpulsecommon-16.1.so()(64bit) \
libsndfile.so.1()(64bit) \
libsndfile.so.1(libsndfile.so.1.0)(64bit) \
libsoxr.so.0()(64bit) \
libspeexdsp.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libtdb.so.1()(64bit) \
libtdb.so.1(TDB_1.2.1)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libwebrtc_audio_processing.so.1()(64bit) \
libxcb.so.1()(64bit) \
pulseaudio-setup \
rtkit \
udev \
user(pulse)"

inherit rpm
