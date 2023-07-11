SUMMARY = "A better mock for file I/O"
DESCRIPTION = "A better mock for file I/O"
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python39-mock-open-1.4.0-2.12.noarch.rpm"
RPM_HASH = "d9cca196ce5a8cc004a62a3869831676e95e7cfc5960f039ebca768e38d51e58499c4388941bececa1cb456c025282344660fb5111327ad391c63f5e2f7cf4de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mock-open \
python39-mock-open \
python3dist-mock-open"

RDEPENDS:${PN} += "python-abi"

inherit rpm
