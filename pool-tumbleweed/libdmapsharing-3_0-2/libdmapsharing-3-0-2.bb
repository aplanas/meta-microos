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

RPM_NAME = "libdmapsharing-3_0-2-2.9.39-1.17.aarch64.rpm"
RPM_HASH = "48f9ec352b445f1b8e38c8433343026817d4ca1ef711acd6f5ce6583857b665f44142aca17a0748401651044708c2a94dec735cf77aa90d1aa2ad333a07d6f34"

RPROVIDES:${PN} += "libdmapsharing-3-0-2 \
libdmapsharing-3.0.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavahi-glib.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstreamer-1.0.so.0 \
libsoup-2.4.so.1 \
libz.so.1"

inherit rpm
