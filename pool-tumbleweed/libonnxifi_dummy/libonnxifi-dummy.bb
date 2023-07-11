SUMMARY = "Library for ONNX Interface for Framework Integration"
DESCRIPTION = "This package exists to create libonnx_proto, so you do no want \
to install this package."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "libonnxifi_dummy-1.12.0-2.10.aarch64.rpm"
RPM_HASH = "e815e2ba3ead18874c8210fb3484c5949fe49448f5e091d77061b238b9b5e8ac3c305644f512ffe259c6db9ba320f61bd53893c2cd68a08c78de01c1a6481040"

RPROVIDES:${PN} += "libonnxifi-dummy \
libonnxifi-dummy.so \
libonnxifi.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
