SUMMARY = "Programmatic API to create and use a devpi server process"
DESCRIPTION = "This package provides a programmatic API to create and use a \
devpi server process."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-devpi-process-0.3.0-1.3.noarch.rpm"
RPM_HASH = "1dc84fede29c5e730bc8f0f653a53dd22acd278fd7432ca4bbecc59341233e73bdf7d5f288bff4d5abf407a31af33472611be7ad7fb3831dfa33444e2f8e9a8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-devpi-process \
python310-devpi-process \
python3dist-devpi-process"

RDEPENDS:${PN} += "python-abi \
python310-devpi-client \
python310-devpi-server"

inherit rpm
