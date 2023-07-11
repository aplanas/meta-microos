SUMMARY = "Header files of onnx"
DESCRIPTION = "Header files of ONNX."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "onnx-devel-1.12.0-2.10.aarch64.rpm"
RPM_HASH = "06aad37aae8459149e543b5a128cf0f80e5c4ce5ae195d909b544c60b1f9fe58295d252f23b8a2319f6e54abcaaf0de41541e8454d6ecd3163cd3ac68c99e6cc"

RPROVIDES:${PN} += "cmake-ONNX \
onnx-devel"

RDEPENDS:${PN} += "libonnx \
libonnx-proto \
libonnxifi-dummy"

inherit rpm
