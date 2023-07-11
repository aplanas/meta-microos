SUMMARY = "A text-to-intent parsing framework"
DESCRIPTION = "The Adapt Intent Parser is a flexible and extensible intent definition and \
determination framework. It is intended to parse natural language text into \
a structured intent that can then be invoked programatically."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python310-adapt-parser-1.0.0-2.5.noarch.rpm"
RPM_HASH = "57de617d1b52f8ebd89bce8480619f961d97f6b3f77b2969cb0761b34051b6b06362f117600339850c537a7eef300fc204c76f81b48c2e43f6e41ca5f5d3266e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-adapt-parser \
python310-adapt-parser \
python3dist-adapt-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
