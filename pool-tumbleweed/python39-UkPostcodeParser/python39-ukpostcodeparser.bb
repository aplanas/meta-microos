SUMMARY = "UK Postcode parser"
DESCRIPTION = "United Kingdom Postcode parser."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python39-UkPostcodeParser-1.1.2-4.2.noarch.rpm"
RPM_HASH = "70fcace2f0b7e82a71c4b4f138d98d22313933ec5130d21096740b33f14afe8ffe0f6d6c45c8c9aeeea28ccad83eeeaa75f637f305cce0cdc2eda09903a4a1fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ukpostcodeparser \
python39-UkPostcodeParser \
python3dist-ukpostcodeparser"

RDEPENDS:${PN} += "python-abi \
python39-base"

inherit rpm
