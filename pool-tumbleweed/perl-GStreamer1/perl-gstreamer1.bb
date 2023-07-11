SUMMARY = "Perl interface to the GStreamer library"
DESCRIPTION = "This package provides perl bindings for GStreamer 1.x. \
GStreamer is a library for constructing graphs of media-handling \
components. The applications it supports range from simple \
OGG Vorbis playback, audio/video streaming to complex audio \
(mixing) and video (non-linear editing) processing."
LICENSE = "BSD-2-Clause"

PV = "0.003"

RPM_NAME = "perl-GStreamer1-0.003-1.30.aarch64.rpm"
RPM_HASH = "55e864238c6e37cf3673cd8827875d4fb71b5b8475e67d35c081e8374c249449156d70f979713bdc28b25022158b9a9959c87a42c4f1cc3a06aa82f99818b560"

RPROVIDES:${PN} += "perl-GStreamer1 \
perl-GStreamer1--Caps--Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Glib--Object--Introspection \
typelib-1-0-Gst-1-0 \
typelib-1-0-GstApp-1-0"

inherit rpm
