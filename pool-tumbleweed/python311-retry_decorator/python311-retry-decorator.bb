SUMMARY = "Retry Decorator"
DESCRIPTION = "Decorator to support retry when an exception occurs."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python311-retry_decorator-1.1.1-1.15.noarch.rpm"
RPM_HASH = "63644bcb55f0f619d2d1389fe1942a240864451c671802a92b4dbed2e37366e16e20b3bfec13365124da7fa2eeeccae38248b7bbe1da965dc15d58f4c5bb9c5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-retry-decorator \
python3.11dist-retry-decorator \
python311-retry-decorator \
python3dist-retry-decorator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
