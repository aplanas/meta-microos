SUMMARY = "HTML form validation, generation, and conversion package"
DESCRIPTION = "FormEncode validates and converts nested structures. It allows for \
a declarative form of defining the validation, and decoupled processes \
for filling and generating forms."
LICENSE = "Python-2.0"

PV = "2.0.1"

RPM_NAME = "python39-FormEncode-2.0.1-2.1.noarch.rpm"
RPM_HASH = "a70943656872a4ed241583831384a1bc04fff39626a120c09f98975db071266bc7fe0a5ab55ca6b29d90746c896fce630eca49dca3c4cb791b172fd53cf3259c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(formencode) \
python39-FormEncode \
python3dist(formencode)"

RDEPENDS:${PN} += "python(abi) \
python39-six"

inherit rpm
