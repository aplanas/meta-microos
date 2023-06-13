SUMMARY = "Library implementing the Digital Media Access Protocol family"
DESCRIPTION = "Libdmapsharing is a library you may use to access, share and control the \
playback of media content using DMAP (DAAP, DPAP & DACP). Libdmapsharing \
also detects audio AirPlay services; coupled with the AirPlay support \
in PulseAudio or GStreamer, this can allow an application to stream audio \
to an AirPlay device. The DMAP family of protocols are used by products \
such as Apple iTunes, Apple iPhoto, and the Roku SoundBridge family to \
share media such as music and photos."
LICENSE = "LGPL-2.1-or-later"

PV = "2.9.39"

RPM_NAME = "libdmapsharing-3_0-2-2.9.39-1.16.aarch64.rpm"
RPM_HASH = "ba2a3e04deec9fe738cef3de614e20ddb0384e9ad26edb79f2de430642ce06c04e2c2ca6e83cf65b930d2649c13da17a752b79634e49a4470776c3c75295dbb9"

RPROVIDES:${PN} += "libdmapsharing-3.0.so.2()(64bit) \
libdmapsharing-3_0-2 \
libdmapsharing-3_0-2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libavahi-client.so.3()(64bit) \
libavahi-common.so.3()(64bit) \
libavahi-glib.so.1()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstapp-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libsoup-2.4.so.1()(64bit) \
libz.so.1()(64bit)"

inherit rpm
