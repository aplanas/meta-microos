SUMMARY = "C++ bindings for the GStreamer streaming multimedia library"
DESCRIPTION = "gstreamermm provides C++ bindings for the GStreamer streaming multimedia \
library (http://gstreamer.freedesktop.org).  With gstreamermm it is possible to \
develop applications that work with multimedia in C++."
LICENSE = "LGPL-2.1-only"

PV = "1.10.0"

RPM_NAME = "gstreamermm-doc-1.10.0-6.9.noarch.rpm"
RPM_HASH = "520fa5c270e269d6ac51bf8c76931faf9875bfe6101c4665bc1aaaf9fe4c083f81cfa8e608c206530c62c6966cd61a25972108d63d38b58b7bfd9f1af557541d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gstreamermm-doc"

RDEPENDS:${PN} += ""

inherit rpm
