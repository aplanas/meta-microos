SUMMARY = "UK Postcode parser"
DESCRIPTION = "United Kingdom Postcode parser."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python311-UkPostcodeParser-1.1.2-4.1.noarch.rpm"
RPM_HASH = "be55a4e45459fc2abc1f1640bd8ff239c182a1140313b12cba08d9f44baae20d846dbd362f4aa65042088bc0fbd8acc667183f372f847679c9e853c51c59f6a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ukpostcodeparser) \
python311-UkPostcodeParser \
python3dist(ukpostcodeparser)"
RDEPENDS:${PN} += "python(abi) \
python311-base"

inherit rpm
