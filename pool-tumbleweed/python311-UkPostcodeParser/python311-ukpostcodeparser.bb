SUMMARY = "UK Postcode parser"
DESCRIPTION = "United Kingdom Postcode parser."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python311-UkPostcodeParser-1.1.2-5.1.noarch.rpm"
RPM_HASH = "bb6c7f4e5e6b00e98de7a2107550e56451b9f5c5d6621ed853bc7fadd2261780d39956ee6cc3109d27f9dcdb0416168ba0cd9cb4973b560e439c52a85dc3fa8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-UkPostcodeParser \
python3.11dist-ukpostcodeparser \
python311-UkPostcodeParser \
python3dist-ukpostcodeparser"

RDEPENDS:${PN} += "python-abi \
python311-base"

inherit rpm
