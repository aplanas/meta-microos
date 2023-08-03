SUMMARY = "HTML form validation, generation, and conversion package"
DESCRIPTION = "FormEncode validates and converts nested structures. It allows for \
a declarative form of defining the validation, and decoupled processes \
for filling and generating forms."
LICENSE = "Python-2.0"

PV = "2.0.1"

RPM_NAME = "python311-FormEncode-2.0.1-3.1.noarch.rpm"
RPM_HASH = "c56c97feb106b82fc461d7c564c321dabb79845cd855392fd215a30428f017a6811b62ddad90ce049dcdeb42f00ce83ee0edac9b2222b8254c3737cc1200a401"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-FormEncode \
python3.11dist-formencode \
python311-FormEncode \
python3dist-formencode"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
