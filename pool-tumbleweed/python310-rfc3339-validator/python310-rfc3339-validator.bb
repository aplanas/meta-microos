SUMMARY = "A pure python RFC3339 validator"
DESCRIPTION = "A pure python RFC3339 validator"
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "python310-rfc3339-validator-0.1.4-2.1.noarch.rpm"
RPM_HASH = "5f236db99d96368b935c7c0b6d917ba2597cc9ae217dad847f0db87a93a4bed11e89b969766b51aaf781eede042d076003cb88bfa0799cd2ef03f710b5f75401"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rfc3339-validator \
python3.10dist(rfc3339-validator) \
python310-rfc3339-validator \
python3dist(rfc3339-validator)"
RDEPENDS:${PN} += "python(abi) \
python310-six"

inherit rpm
