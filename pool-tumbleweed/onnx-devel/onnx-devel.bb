SUMMARY = "Header files of onnx"
DESCRIPTION = "Header files of ONNX."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "onnx-devel-1.12.0-3.1.aarch64.rpm"
RPM_HASH = "32c3be424cb6160a3bbc29a9dee79ce5ca936da556b515ad5db6b1f5550f467b7c26cb7fa5d1aca2300bb3ac55dbb0a4b0a53156fc55195670b3a5b3b21df2e8"

RPROVIDES:${PN} += "cmake-ONNX \
onnx-devel"

RDEPENDS:${PN} += "libonnx \
libonnx-proto \
libonnxifi-dummy"

inherit rpm
