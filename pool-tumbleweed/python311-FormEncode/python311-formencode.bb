SUMMARY = "HTML form validation, generation, and conversion package"
DESCRIPTION = "FormEncode validates and converts nested structures. It allows for \
a declarative form of defining the validation, and decoupled processes \
for filling and generating forms."
LICENSE = "Python-2.0"

PV = "2.0.1"

RPM_NAME = "python311-FormEncode-2.0.1-2.3.noarch.rpm"
RPM_HASH = "64b04291d56e397bec2da5b109062493b154d52988634b8e51e462a672c02a41a38637feb1046cf6cb1b750830cadbc82723b669507b1838bd7dacf7cb402373"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-FormEncode \
python3.11dist-formencode \
python311-FormEncode \
python3dist-formencode"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
