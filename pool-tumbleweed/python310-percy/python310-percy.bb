SUMMARY = "Visual regression testing library"
DESCRIPTION = "Python client library for visual regression testing with Percy."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python310-percy-2.0.2-2.1.noarch.rpm"
RPM_HASH = "67ae53a865c0bf57d8031c2e4015a949edec7da828a7019f8caaa4b209ea4114aafdecff61b713f48f6bc528994f0501a6507f1e8a4e8858b9807ebca46a08e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-percy \
python310-percy \
python3dist-percy"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
