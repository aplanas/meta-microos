SUMMARY = "Shared library for onnx protocul bufer"
DESCRIPTION = "Shared library for the protocol buffer library, packaged separately to be \
used by external project."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "libonnx_proto-1.12.0-2.10.aarch64.rpm"
RPM_HASH = "a63fdfa5e1a7ef801ffd449f1fbf1930ec82d14d3c9815bc580c3e7ba9af98ad46093560e98926fc72fd547b5a63051f64684d5df71c582ff6325d9467a64a98"

RPROVIDES:${PN} += "libonnx-proto \
libonnx-proto.so"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libprotobuf-3.21.12.so \
libstdc++.so.6"

inherit rpm
