SUMMARY = "UK Postcode parser"
DESCRIPTION = "United Kingdom Postcode parser."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python310-UkPostcodeParser-1.1.2-4.2.noarch.rpm"
RPM_HASH = "c2a483762f49ca2bd3077ce8aa265704d9e67d4662a3b38cd89059e66b0b46f2555dbd2e18c9c1c6f4ba1562b95ec1998a590c17d9ac24d3a4d68c4e2c39a0ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ukpostcodeparser \
python310-UkPostcodeParser \
python3dist-ukpostcodeparser"

RDEPENDS:${PN} += "python-abi \
python310-base"

inherit rpm
