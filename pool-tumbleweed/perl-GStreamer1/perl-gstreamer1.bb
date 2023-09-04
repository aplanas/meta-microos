SUMMARY = "Perl interface to the GStreamer library"
DESCRIPTION = "This package provides perl bindings for GStreamer 1.x. \
GStreamer is a library for constructing graphs of media-handling \
components. The applications it supports range from simple \
OGG Vorbis playback, audio/video streaming to complex audio \
(mixing) and video (non-linear editing) processing."
LICENSE = "BSD-2-Clause"

PV = "0.003"

RPM_NAME = "perl-GStreamer1-0.003-1.31.aarch64.rpm"
RPM_HASH = "c0147e838979dda3a6d8baf04ed8eb16cc63bae8619d2fa545c10c28749efc639e0b40f28b895f872f2b4f7e69d9c0085ba0632b11bd7dfe7195b204007e8792"

RPROVIDES:${PN} += "perl-GStreamer1 \
perl-GStreamer1--Caps--Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Glib--Object--Introspection \
typelib-1-0-Gst-1-0 \
typelib-1-0-GstApp-1-0"

inherit rpm
