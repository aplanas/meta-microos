SUMMARY = "GStreamer documentation"
DESCRIPTION = "GStreamer documentation."
LICENSE = "(BSD-2-Clause | LGPL-2.1-or-later | MIT) & OPL-1.0 & CC-BY-SA-4.0"

PV = "1.22.4"

RPM_NAME = "gstreamer-docs-1.22.4-1.1.noarch.rpm"
RPM_HASH = "dce247ae5419acc338248683eb8d4109ad8f769c37b5f66cd55f9861b70754fa4ebf7ebdb6b9c4feb4407f2d8cb36d6583e85079495b0a0be1202a27986c8b1e"
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
