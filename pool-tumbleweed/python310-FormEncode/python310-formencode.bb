SUMMARY = "HTML form validation, generation, and conversion package"
DESCRIPTION = "FormEncode validates and converts nested structures. It allows for \
a declarative form of defining the validation, and decoupled processes \
for filling and generating forms."
LICENSE = "Python-2.0"

PV = "2.0.1"

RPM_NAME = "python310-FormEncode-2.0.1-2.1.noarch.rpm"
RPM_HASH = "dd418c01244541f141440d18ee864bd7a4ffadf779670cd9c979cd838f7d86fc0ab8dc2401c6123f1c06c3050597556cb8275ecdd03559c7ab7a4cb5783499e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-FormEncode \
python3.10dist(formencode) \
python310-FormEncode \
python3dist(formencode)"

RDEPENDS:${PN} += "python(abi) \
python310-six"

inherit rpm
