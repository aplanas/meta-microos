SUMMARY = "A better mock for file I/O"
DESCRIPTION = "A better mock for file I/O"
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python311-mock-open-1.4.0-2.11.noarch.rpm"
RPM_HASH = "ef5d681d90a217b5c6f8e1113b7cf0f4af0a1c59f8bdb8c090ecf23a36f32c7282c35c206da621e27d78a09884693fc6a59a1e471582ca3c258bbe0fb9f6a5db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-mock-open \
python311-mock-open \
python3dist-mock-open"

RDEPENDS:${PN} += "python-abi"

inherit rpm
