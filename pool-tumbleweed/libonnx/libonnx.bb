SUMMARY = "Shared library for onnx"
DESCRIPTION = "This package exists to create libonnx_proto, so you do no want \
to install this package."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "libonnx-1.12.0-3.1.aarch64.rpm"
RPM_HASH = "ea77936cce630bdc49371457e2bf760ec742b5f5a4743b202a05a339243f150f9d34f785ecc5f81671035d8a0d340c65777e68d7f2219ee3f9ef5dccea2ddb75"

RPROVIDES:${PN} += "libonnx \
libonnx.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libonnx-proto.so \
libprotobuf-3.21.12.so \
libstdc++.so.6"

inherit rpm
