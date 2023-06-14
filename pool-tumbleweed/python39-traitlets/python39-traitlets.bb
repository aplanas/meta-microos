SUMMARY = "Traitlets Python configuration system"
DESCRIPTION = "A configuration system for Python applications."
LICENSE = "BSD-3-Clause"

PV = "5.9.0"

RPM_NAME = "python39-traitlets-5.9.0-2.1.noarch.rpm"
RPM_HASH = "13584f0df99959bbd885e52436e1146d92acc56ef2d5349c753010bb9f88cd2ba57dd1c897c908499f92963aa661b99f03d10ca79dcaffcc76eca89e50dab033"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-traitlets \
python39-traitlets \
python3dist-traitlets"

RDEPENDS:${PN} += "python-abi"

inherit rpm
