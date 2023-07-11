SUMMARY = "A text-to-intent parsing framework"
DESCRIPTION = "The Adapt Intent Parser is a flexible and extensible intent definition and \
determination framework. It is intended to parse natural language text into \
a structured intent that can then be invoked programatically."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python311-adapt-parser-1.0.0-2.5.noarch.rpm"
RPM_HASH = "8fc4d3a40c1470a914e4d37a830b1a9ebe5386077accc401844a154b5a16a4ad9bfa777b79059cb610ba16ed35ac73e7f4633b2d072fe1bb776395ce2605c2fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-adapt-parser \
python3.11dist-adapt-parser \
python311-adapt-parser \
python3dist-adapt-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
