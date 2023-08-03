SUMMARY = "Test data"
DESCRIPTION = "This packages includes the data for testing the backend."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "onnx-backend-test-1.12.0-3.1.aarch64.rpm"
RPM_HASH = "03198c84c836693d3e6bca7cc9f71c78cef31743568bf6e2ab5e54c5c8c8c81a21d5adbee0e6625231e3fc2a4a8947f974f32a866efe4c84cefa13c611b6a1d8"

RPROVIDES:${PN} += "onnx-backend-test"

RDEPENDS:${PN} += ""

inherit rpm
