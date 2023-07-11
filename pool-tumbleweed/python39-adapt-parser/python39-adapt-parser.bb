SUMMARY = "A text-to-intent parsing framework"
DESCRIPTION = "The Adapt Intent Parser is a flexible and extensible intent definition and \
determination framework. It is intended to parse natural language text into \
a structured intent that can then be invoked programatically."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python39-adapt-parser-1.0.0-2.5.noarch.rpm"
RPM_HASH = "6b7e7eddbde5f79424ec8e04958df4d28e36fc6cae3aa01c8814207e7bdb71a37154fff80946ffcd89080d1f871073d84ae7150077dc400b7a26dedc45fae5ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-adapt-parser \
python39-adapt-parser \
python3dist-adapt-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
