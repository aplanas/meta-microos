SUMMARY = "HTML form validation, generation, and conversion package"
DESCRIPTION = "FormEncode validates and converts nested structures. It allows for \
a declarative form of defining the validation, and decoupled processes \
for filling and generating forms."
LICENSE = "Python-2.0"

PV = "2.0.1"

RPM_NAME = "python311-FormEncode-2.0.1-2.1.noarch.rpm"
RPM_HASH = "bc168141b3ebac4eeea1c2b94753390bb91fa141c1266effc904d22cb27552d2a94fb9361f9d78f28411d1879b622f7d28c1b74872de0287d73e265412850d59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-formencode \
python311-FormEncode \
python3dist-formencode"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
