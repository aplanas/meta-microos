SUMMARY = "Python library to communicate with Redfish based systems"
DESCRIPTION = "Sushy is a Python library to communicate with `Redfish` based systems."
LICENSE = "Apache-2.0"

PV = "4.5.0"

RPM_NAME = "python3-sushy-4.5.0-1.1.noarch.rpm"
RPM_HASH = "7f240f677fdf560963a82199007c0ed3866ef6501016c1945dfcb08556dcda6dfac4f58d62630c75582418833be4e19e6d616fb5c414f6fb74ca49f38268e424"
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
