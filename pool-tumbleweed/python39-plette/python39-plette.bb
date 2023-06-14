SUMMARY = "Structured Pipfile and Pipfile.lock models"
DESCRIPTION = "Structured Pipfile and Pipfile.lock models."
LICENSE = "ISC"

PV = "0.4.4"

RPM_NAME = "python39-plette-0.4.4-1.3.noarch.rpm"
RPM_HASH = "d8bb01888f18eb0b05230c31dd6e29c54a34f8008a4a337773f8d7357f40167d18394422f78cc073300fd939c7acc2a287056f4e441027af81683fec94bad563"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-plette \
python39-plette \
python3dist-plette"

RDEPENDS:${PN} += "python-abi \
python39-tomlkit"

inherit rpm
