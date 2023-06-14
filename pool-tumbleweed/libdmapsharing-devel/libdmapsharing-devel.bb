SUMMARY = "Library implementing the DMAP family of protocols - Development Files"
DESCRIPTION = "Libdmapsharing is a library you may use to access, share and control the \
playback of media content using DMAP (DAAP, DPAP & DACP). Libdmapsharing \
also detects audio AirPlay services; coupled with the AirPlay support \
in PulseAudio or GStreamer, this can allow an application to stream audio \
to an AirPlay device. The DMAP family of protocols are used by products \
such as Apple iTunes, Apple iPhoto, and the Roku SoundBridge family to \
share media such as music and photos. \
 \
This package contains development files for libdmapsharing."
LICENSE = "LGPL-2.1-or-later"

PV = "3.9.12"

RPM_NAME = "libdmapsharing-devel-3.9.12-1.1.aarch64.rpm"
RPM_HASH = "470998e0ac3fcb86aed1205eb0099ae4c534604ba52a7d95a81a524b55c8a11131c739b2c3c699a35ae1960bcdf5645d6a3cad0ddb2a1079de2a72832b4bed67"

RPROVIDES:${PN} += "libdmapsharing-devel \
pkgconfig-libdmapsharing-4.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdmapsharing-4-0-3 \
pkgconfig-glib-2.0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-app-1.0 \
pkgconfig-libsoup-3.0 \
typelib-1-0-Dmap-4-0"

inherit rpm
