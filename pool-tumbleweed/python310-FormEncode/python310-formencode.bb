SUMMARY = "HTML form validation, generation, and conversion package"
DESCRIPTION = "FormEncode validates and converts nested structures. It allows for \
a declarative form of defining the validation, and decoupled processes \
for filling and generating forms."
LICENSE = "Python-2.0"

PV = "2.0.1"

RPM_NAME = "python310-FormEncode-2.0.1-3.1.noarch.rpm"
RPM_HASH = "41fd3ad9e15c644259bfe4fac685adb37a8766a5eb0a24be571d3e3d7f9385c36cdbc6a802794b7a8edfb9883f12419edb8af8970650f3a1add6e197000b4853"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-formencode \
python310-FormEncode \
python3dist-formencode"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
