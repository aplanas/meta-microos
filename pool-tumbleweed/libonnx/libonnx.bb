SUMMARY = "Shared library for onnx"
DESCRIPTION = "This package exists to create libonnx_proto, so you do no want \
to install this package."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "libonnx-1.12.0-2.9.aarch64.rpm"
RPM_HASH = "5115d8e4cd7ad7a5c939a4b907f5a60650cc60b39de01540ef98c48d71fed911f52f8af9a762b984c747b5ce3449d4c27933282e7e7d60ead4e4552ee53fc9d9"

RPROVIDES:${PN} += "libonnx \
libonnx.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libonnx-proto.so \
libprotobuf-3.21.12.so \
libstdc++.so.6"

inherit rpm
