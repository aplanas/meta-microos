SUMMARY = "A better mock for file I/O"
DESCRIPTION = "A better mock for file I/O"
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python310-mock-open-1.4.0-2.12.noarch.rpm"
RPM_HASH = "33b662ef5b1b2f0f185604e52728cc21a0c954e5f51138db69b963f5ce0c3cd5a15e02a4404b62e7e2b9a98406f87876ca093654ca7d0e19fa2c90967f81423b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mock-open \
python310-mock-open \
python3dist-mock-open"

RDEPENDS:${PN} += "python-abi"

inherit rpm
