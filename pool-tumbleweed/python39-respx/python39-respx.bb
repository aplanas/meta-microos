SUMMARY = "Mock HTTPX with request patterns and response side effects"
DESCRIPTION = "Python library to mock httpx with request patterns and responses"
LICENSE = "BSD-3-Clause"

PV = "0.20.1"

RPM_NAME = "python39-respx-0.20.1-2.1.noarch.rpm"
RPM_HASH = "82396ea7553d9d0477a4674cc8b36737dbd7aba5207d37c3244061bd1429a502a39d813364cac8847b5a18d854ce7d315a74c9a7052737ab98d332a7d4ef2d9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-respx \
python39-respx \
python3dist-respx"

RDEPENDS:${PN} += "python-abi"

inherit rpm
