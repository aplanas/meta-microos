SUMMARY = "HTML form validation, generation, and conversion package"
DESCRIPTION = "FormEncode validates and converts nested structures. It allows for \
a declarative form of defining the validation, and decoupled processes \
for filling and generating forms."
LICENSE = "Python-2.0"

PV = "2.0.1"

RPM_NAME = "python39-FormEncode-2.0.1-2.3.noarch.rpm"
RPM_HASH = "bc297b70577f86f9a41dbd5337f48f3deafe72ef2771a44c273a02a1aa3e0a0ef85dbb88297dbc6318074784e83f208b8b5c6817ac0d61ba55f0b2de1b22e04e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-formencode \
python39-FormEncode \
python3dist-formencode"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
