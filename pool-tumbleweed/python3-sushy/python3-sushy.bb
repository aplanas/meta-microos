SUMMARY = "Python library to communicate with Redfish based systems"
DESCRIPTION = "Sushy is a Python library to communicate with `Redfish` based systems."
LICENSE = "Apache-2.0"

PV = "4.4.2"

RPM_NAME = "python3-sushy-4.4.2-1.3.noarch.rpm"
RPM_HASH = "c9a6e9735067d025e008759362723605f89dce10329f9daf56e9e19b51c232cc262831bf6b3580b0ab5345aa038a171f7944bca817a2bf706a3373e851956fde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sushy \
python3.11dist-sushy \
python3dist-sushy"

RDEPENDS:${PN} += "python-abi \
python3-pbr \
python3-python-dateutil \
python3-requests \
python3-stevedore"

inherit rpm
