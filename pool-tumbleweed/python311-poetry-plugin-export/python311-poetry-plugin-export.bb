SUMMARY = "Poetry plugin to export the dependencies to various formats"
DESCRIPTION = "Poetry plugin to export the dependencies to various formats"
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python311-poetry-plugin-export-1.4.0-1.3.noarch.rpm"
RPM_HASH = "6a14ce6b3e16830e65eeb8c414aca5be63b8eb76c653348aaab9e79dc21891b0df74e93e3a520006570a74986ae9810eb2ff71594fbd88a93cf8f9a4ee420938"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-poetry-plugin-export \
python3.11dist-poetry-plugin-export \
python311-poetry-plugin-export \
python3dist-poetry-plugin-export"

RDEPENDS:${PN} += "python-abi \
python311-poetry \
python311-poetry-core"

inherit rpm
