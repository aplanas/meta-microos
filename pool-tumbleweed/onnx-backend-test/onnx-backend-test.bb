SUMMARY = "Test data"
DESCRIPTION = "This packages includes the data for testing the backend."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "onnx-backend-test-1.12.0-2.9.aarch64.rpm"
RPM_HASH = "d5458e364739bcb637dc9ce0fbd6e7f2c0660836d42905325e9a89c67aba999ae1991b3da5f6b2a8ef0655dc1cce4453fd06bda918b4bb10f96b7a20381b58a6"

RPROVIDES:${PN} += "onnx-backend-test \
onnx-backend-test(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
