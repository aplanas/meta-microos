SUMMARY = "GStreamer documentation"
DESCRIPTION = "GStreamer documentation."
LICENSE = "(BSD-2-Clause | LGPL-2.1-or-later | MIT) & OPL-1.0 & CC-BY-SA-4.0"

PV = "1.22.5"

RPM_NAME = "gstreamer-docs-1.22.5-1.1.noarch.rpm"
RPM_HASH = "8f9f4fbf375cecc2eeaf329f9c3b1c53df57034b0082c301f6d8c9a609f676d70476820d8b8d8d4a96f2a15cf19eeb6b47f8bc5dd5487994053adbfae77e61ca"
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
