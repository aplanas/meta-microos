SUMMARY = "Progress bars for Python"
DESCRIPTION = "Progress bars for Python."
LICENSE = "ISC"

PV = "1.6"

RPM_NAME = "python39-progress-1.6-1.8.noarch.rpm"
RPM_HASH = "8c2b4809ea22dcc8a601caed3b61b84cf06b7859dfc6479c2452214f4fce0ef169d0d920382656d6cf90dd58f6464655802f76fb74d0f93168c1e56240db71df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(progress) \
python39-progress \
python3dist(progress)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
