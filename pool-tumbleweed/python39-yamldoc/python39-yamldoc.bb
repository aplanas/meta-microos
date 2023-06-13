SUMMARY = "A module to determine file mimetypes"
DESCRIPTION = "This module is a layer on top of the standard Python mimetypes module and \
python-magic. Python-magic only works with local files to which you need to \
have access, while mimetypes only uses the filename to determine its \
filetype."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.0"

RPM_NAME = "python39-yamldoc-0.3.0-1.14.noarch.rpm"
RPM_HASH = "93a20e6f9a6b12a255b4197a84a288b53daca51d6e70255adc1c18fee4ad91879721098dab2a7a35ee8895fdeb1ea0a70d6ee4e4f69f414b47118f128133cbff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-yamldoc) \
python39-yamldoc \
python3dist(python-yamldoc)"

RDEPENDS:${PN} += "python(abi) \
python39-PyYAML"

inherit rpm
