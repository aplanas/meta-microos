SUMMARY = "HTML form validation, generation, and conversion package"
DESCRIPTION = "FormEncode validates and converts nested structures. It allows for \
a declarative form of defining the validation, and decoupled processes \
for filling and generating forms."
LICENSE = "Python-2.0"

PV = "2.0.1"

RPM_NAME = "python310-FormEncode-2.0.1-2.3.noarch.rpm"
RPM_HASH = "4ff322a3323b8189aa266b581482226bb3263114aca9b7c166f1b611faaece30a629a6f417ae36df1d3b36540bf0b5bf0cb665e32a382c45b68255148cf22734"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-formencode \
python310-FormEncode \
python3dist-formencode"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
