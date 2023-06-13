SUMMARY = "Header files of onnx"
DESCRIPTION = "Header files of ONNX."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "onnx-devel-1.12.0-2.9.aarch64.rpm"
RPM_HASH = "7aba91137b938ab6791843e1160bfed6c5e62e986b6559c09172710d71b89650612b4dfbd99aa92fa82f5b01eb46c668e2a6c1d09c592d9164f41742421dcfa2"

RPROVIDES:${PN} += "cmake(ONNX) \
onnx-devel \
onnx-devel(aarch-64)"

RDEPENDS:${PN} += "libonnx \
libonnx_proto \
libonnxifi_dummy"

inherit rpm
