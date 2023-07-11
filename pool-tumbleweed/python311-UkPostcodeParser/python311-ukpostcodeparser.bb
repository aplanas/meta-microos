SUMMARY = "UK Postcode parser"
DESCRIPTION = "United Kingdom Postcode parser."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python311-UkPostcodeParser-1.1.2-4.2.noarch.rpm"
RPM_HASH = "b17b986874eb67cc156e12ba7755e7078bc34950d62cc34ae0a845216b796b4adfdcc2683de60e958f9f3512ca36822db9c16f337f7b7b5b4c48aeb395a2d663"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-UkPostcodeParser \
python3.11dist-ukpostcodeparser \
python311-UkPostcodeParser \
python3dist-ukpostcodeparser"

RDEPENDS:${PN} += "python-abi \
python311-base"

inherit rpm
