SUMMARY = "GStreamer documentation"
DESCRIPTION = "GStreamer documentation."
LICENSE = "(BSD-2-Clause | LGPL-2.1-or-later | MIT) & OPL-1.0 & CC-BY-SA-4.0"

PV = "1.22.3"

RPM_NAME = "gstreamer-docs-1.22.3-1.1.noarch.rpm"
RPM_HASH = "684598ce3fd7170857df860c589e72524498399d981012377c79231d97d0a9e9eb398f0a8254cc375c139fbf5f38ac54aec5e5b0d1aedb535aab467797a1ed6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gstreamer-doc \
gstreamer-docs \
gstreamer-plugins-bad-doc \
gstreamer-plugins-base-doc \
gstreamer-plugins-good-doc \
gstreamer-plugins-libav-doc \
gstreamer-plugins-ugly-doc \
gstreamer-plugins-vaapi-doc"

RDEPENDS:${PN} += ""

inherit rpm
