SUMMARY = "Shared library for onnx"
DESCRIPTION = "This package exists to create libonnx_proto, so you do no want \
to install this package."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "libonnx-1.12.0-2.10.aarch64.rpm"
RPM_HASH = "0cb5226dec1e7462aaf22a9071e9357d0e734e2fbf2d9c13af77078e0b2c459efc0594df52fd74cd73e59a8a399ec7520a1522a09ccfa2adac74037c9561a1f5"

RPROVIDES:${PN} += "libonnx \
libonnx.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libonnx-proto.so \
libprotobuf-3.21.12.so \
libstdc++.so.6"

inherit rpm
