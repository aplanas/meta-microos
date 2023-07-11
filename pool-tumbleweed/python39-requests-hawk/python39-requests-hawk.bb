SUMMARY = "Hawk authentication strategy for the requests python library"
DESCRIPTION = "This project allows you to use the python requests library with the hawk \
authentification mechanism. \
 \
Hawk itself does not provide any mechanism for obtaining or transmitting the \
set of shared credentials required, but this project proposes a scheme we use \
across mozilla services projects."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "python39-requests-hawk-1.2.1-1.3.noarch.rpm"
RPM_HASH = "db3d0f7e3f9d794547255188c321c5d960715ce91e852ad735509d44d9c250f4492d4e61f7862b9efd38b51a249e62ff776f499de35622a8d6248782248e4956"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-requests-hawk \
python39-requests-hawk \
python3dist-requests-hawk"

RDEPENDS:${PN} += "python-abi \
python39-mohawk \
python39-requests"

inherit rpm
