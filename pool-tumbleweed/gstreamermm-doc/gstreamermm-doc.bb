SUMMARY = "C++ bindings for the GStreamer streaming multimedia library"
DESCRIPTION = "gstreamermm provides C++ bindings for the GStreamer streaming multimedia \
library (http://gstreamer.freedesktop.org).  With gstreamermm it is possible to \
develop applications that work with multimedia in C++."
LICENSE = "LGPL-2.1-only"

PV = "1.10.0"

RPM_NAME = "gstreamermm-doc-1.10.0-6.10.noarch.rpm"
RPM_HASH = "4338be5380968a4b12e71681356463f9e1f51ad70c6d38f50363391f7775d7d7c29e34b06a881a6e62f9e9ebcf164b79919be98b9a6d394e9a2ca65e9141d5f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gstreamermm-doc"

RDEPENDS:${PN} += ""

inherit rpm
