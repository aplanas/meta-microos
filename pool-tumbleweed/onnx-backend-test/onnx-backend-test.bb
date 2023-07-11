SUMMARY = "Test data"
DESCRIPTION = "This packages includes the data for testing the backend."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "onnx-backend-test-1.12.0-2.10.aarch64.rpm"
RPM_HASH = "e5ed361fdd4d07024180db0af24e522f6eeba588a31b8b9a93b11317d809cdb75a96b465d1b5f79a6a9dee504e3abe402d1bf771a60aee08cdb67b344402757e"

RPROVIDES:${PN} += "onnx-backend-test"

RDEPENDS:${PN} += ""

inherit rpm
