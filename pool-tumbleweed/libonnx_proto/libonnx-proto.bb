SUMMARY = "Shared library for onnx protocul bufer"
DESCRIPTION = "Shared library for the protocol buffer library, packaged separately to be \
used by external project."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "libonnx_proto-1.12.0-2.9.aarch64.rpm"
RPM_HASH = "0f0d214622f2f698b76343f51b1ac5bcd43892a3aaf75ec1bf3f711a2d6b8d1c279d3fa63b8bd832ab281303f9abc52ea3144f59ce9477472af46d34aa6de446"

RPROVIDES:${PN} += "libonnx_proto \
libonnx_proto(aarch-64) \
libonnx_proto.so()(64bit)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libprotobuf-3.21.12.so()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
