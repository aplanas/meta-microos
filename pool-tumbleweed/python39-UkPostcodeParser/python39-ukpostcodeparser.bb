SUMMARY = "UK Postcode parser"
DESCRIPTION = "United Kingdom Postcode parser."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python39-UkPostcodeParser-1.1.2-5.1.noarch.rpm"
RPM_HASH = "dbba9dde98b0293bef608b571875639b4232bb1bab015092e80c778c428e6d4c59d63b5eaecb59d7216f0641098d7aa15ff7710330e982a3d3eed2b95f7f52a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ukpostcodeparser \
python39-UkPostcodeParser \
python3dist-ukpostcodeparser"

RDEPENDS:${PN} += "python-abi \
python39-base"

inherit rpm
