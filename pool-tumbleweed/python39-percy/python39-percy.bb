SUMMARY = "Visual regression testing library"
DESCRIPTION = "Python client library for visual regression testing with Percy."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python39-percy-2.0.2-2.1.noarch.rpm"
RPM_HASH = "7be52a2e2666dbdbaaa1bba696f3d2eef32c8b6ffd3bdafb5ebf20cf82200a23709c29f8406ef8d69eb3304a48696db0638fc8e887bdc36082f872366ff1e536"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-percy \
python39-percy \
python3dist-percy"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
