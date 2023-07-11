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

PV = "2.9.39"

RPM_NAME = "libdmapsharing3-devel-2.9.39-1.17.aarch64.rpm"
RPM_HASH = "b854087ecc33bb2ec12240ad997c764a5d6070fe57305b52e49cb991f1e3f78d7d7f910b2c5e65a76779580b6f7013c3730e27cddf13a4c3cfdc8ea746a33f8c"

RPROVIDES:${PN} += "libdmapsharing3-devel \
pkgconfig-libdmapsharing-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdmapsharing-3-0-2 \
pkgconfig-glib-2.0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-libsoup-2.4"

inherit rpm
