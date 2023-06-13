SUMMARY = "Source code of opencensus-proto"
DESCRIPTION = "Protocol buffers for OpenCensus - a framework for collecting metrics and \
distributed traces from services. \
 \
This package contains source code for googleapis."
LICENSE = "Apache-2.0"

PV = "0.3.0+git.20200721"

RPM_NAME = "opencensus-proto-source-0.3.0+git.20200721-1.2.noarch.rpm"
RPM_HASH = "deb36b0e50c2e70426fb34e2aa41e22c2cc96acbb3f9d8c3601f8f0c746949761e99f277fdab4480b54d65ab3fe619023d765856a6a59b3bb77cdd94ed4c00cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "opencensus-proto-source"

RDEPENDS:${PN} += ""

inherit rpm
