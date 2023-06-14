SUMMARY = "Tools to work with documents in MS Visio file-format"
DESCRIPTION = "This package contains tools to work with documents in MS Visio file-format."
LICENSE = "MPL-2.0"

PV = "0.1.7"

RPM_NAME = "libvisio-tools-0.1.7-1.27.aarch64.rpm"
RPM_HASH = "a86bcf27fc40e5a862b60c6bda1140f815d4ad4b4db74731ea77ac52ca5b2e8293544bde5c80310018c23568f09ee571121d737a9f130b2931f38d0f746da935"

RPROVIDES:${PN} += "libvisio-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
librevenge-generators-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libstdc++.so.6 \
libvisio-0.1.so.1"

inherit rpm
