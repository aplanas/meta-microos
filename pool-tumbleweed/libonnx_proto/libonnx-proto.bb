SUMMARY = "Shared library for onnx protocul bufer"
DESCRIPTION = "Shared library for the protocol buffer library, packaged separately to be \
used by external project."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "libonnx_proto-1.12.0-2.9.aarch64.rpm"
RPM_HASH = "0f0d214622f2f698b76343f51b1ac5bcd43892a3aaf75ec1bf3f711a2d6b8d1c279d3fa63b8bd832ab281303f9abc52ea3144f59ce9477472af46d34aa6de446"

RPROVIDES:${PN} += "libonnx-proto \
libonnx-proto.so"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libprotobuf-3.21.12.so \
libstdc++.so.6"

inherit rpm
