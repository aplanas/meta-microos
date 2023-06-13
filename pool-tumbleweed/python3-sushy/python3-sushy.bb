SUMMARY = "Python library to communicate with Redfish based systems"
DESCRIPTION = "Sushy is a Python library to communicate with `Redfish` based systems."
LICENSE = "Apache-2.0"

PV = "4.4.2"

RPM_NAME = "python3-sushy-4.4.2-1.2.noarch.rpm"
RPM_HASH = "9457c3bfcc548254467eaeaa8d904dbc015c9b8f149fa292e03bfa8a84daf18ef8ec409468e789652476a86d1b9fe7bbd35a4271b5a85ea18159e736156536e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sushy \
python3.10dist(sushy) \
python3dist(sushy)"

RDEPENDS:${PN} += "python(abi) \
python3-pbr \
python3-python-dateutil \
python3-requests \
python3-stevedore"

inherit rpm
