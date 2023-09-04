SUMMARY = "UK Postcode parser"
DESCRIPTION = "United Kingdom Postcode parser."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python310-UkPostcodeParser-1.1.2-5.1.noarch.rpm"
RPM_HASH = "100da9351537f5f1327d19b0a65ff10a6f27614df8e74d66749433561238445ec6919192e652c3dae372c3171114193a4b0e408e60d8a6dad2496a76c592d53c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ukpostcodeparser \
python310-UkPostcodeParser \
python3dist-ukpostcodeparser"

RDEPENDS:${PN} += "python-abi \
python310-base"

inherit rpm
