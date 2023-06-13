SUMMARY = "A text-to-intent parsing framework"
DESCRIPTION = "The Adapt Intent Parser is a flexible and extensible intent definition and \
determination framework. It is intended to parse natural language text into \
a structured intent that can then be invoked programatically."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python39-adapt-parser-1.0.0-2.3.noarch.rpm"
RPM_HASH = "ab8cbc25babc79efa05e8883c7b6d28885928895fda1e5965bec23b380d9ff516c8ca2e00f3fa5b3bedb82cc9b5a8d3bcac2029289bde0013228c607e59b23a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(adapt-parser) \
python39-adapt-parser \
python3dist(adapt-parser)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
