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

RPM_NAME = "libdmapsharing3-devel-2.9.39-1.16.aarch64.rpm"
RPM_HASH = "cdd36cb4720501e791498462df38182299fa72af551f0dc96e8adc3e19814288fb176ee60e0c417014211253d1c6952655f33b2e2c0e68e3a9585746e11d2a0c"

RPROVIDES:${PN} += "libdmapsharing3-devel \
pkgconfig-libdmapsharing-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdmapsharing-3-0-2 \
pkgconfig-glib-2.0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-libsoup-2.4"

inherit rpm
