SUMMARY = "Command line-driven HTTP request builder"
DESCRIPTION = "Command line-driven HTTP request builder"
LICENSE = "ISC"

PV = "0.7.1"

RPM_NAME = "python311-requestbuilder-0.7.1-1.17.noarch.rpm"
RPM_HASH = "3f971087769fb6f94ce6502b54f84360e3eeb248dccf1ba2a71ca1da489b0210da79483fd9954f5f97e87abcef383436c0a96292dc04f39cf07e0c0d13da3b65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requestbuilder \
python3.11dist-requestbuilder \
python311-requestbuilder \
python3dist-requestbuilder"

RDEPENDS:${PN} += "python-abi"

inherit rpm
