SUMMARY = "A text-to-intent parsing framework"
DESCRIPTION = "The Adapt Intent Parser is a flexible and extensible intent definition and \
determination framework. It is intended to parse natural language text into \
a structured intent that can then be invoked programatically."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python311-adapt-parser-1.0.0-2.3.noarch.rpm"
RPM_HASH = "ded439fe405217c81db51c215e2facb9e3fe0478feec046f9c28115152f8b92352b6e798b6b2c7473e2f67ffac46a816bc8cf62fc9f3f81c88efd2c672a5da78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-adapt-parser \
python311-adapt-parser \
python3dist-adapt-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
