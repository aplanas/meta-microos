SUMMARY = "UK Postcode parser"
DESCRIPTION = "United Kingdom Postcode parser."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python310-UkPostcodeParser-1.1.2-4.1.noarch.rpm"
RPM_HASH = "2ca656f0dffb1aff127e7dea7e623a738459ac79df1a476df23901ddd99f0b34102d68b4974bdc6728ace8c7b6dd842c9a67a2aad989ad9625a77ed3e5fe48b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-UkPostcodeParser \
python3.10dist(ukpostcodeparser) \
python310-UkPostcodeParser \
python3dist(ukpostcodeparser)"
RDEPENDS:${PN} += "python(abi) \
python310-base"

inherit rpm
