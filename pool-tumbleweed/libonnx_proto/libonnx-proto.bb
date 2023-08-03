SUMMARY = "Shared library for onnx protocul bufer"
DESCRIPTION = "Shared library for the protocol buffer library, packaged separately to be \
used by external project."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "libonnx_proto-1.12.0-3.1.aarch64.rpm"
RPM_HASH = "182718833c47a6f021fd946c0036b2a7382a4c5056571776f9fece3b808780523215eaac1a3c3af496227295bb9d69016b0efa18441adaa2e86c5adc4a47a521"

RPROVIDES:${PN} += "libonnx-proto \
libonnx-proto.so"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libprotobuf-3.21.12.so \
libstdc++.so.6"

inherit rpm
