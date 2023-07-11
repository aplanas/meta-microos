SUMMARY = "Hawk authentication strategy for the requests python library"
DESCRIPTION = "This project allows you to use the python requests library with the hawk \
authentification mechanism. \
 \
Hawk itself does not provide any mechanism for obtaining or transmitting the \
set of shared credentials required, but this project proposes a scheme we use \
across mozilla services projects."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "python310-requests-hawk-1.2.1-1.3.noarch.rpm"
RPM_HASH = "7997e60c6ae0b35c7446967f69157cef9f39c5af6b4c67a1a5a86cc03935cd2ea579c75e3a5b61a89ed6d5357144fb53a3bd8f48281d35a494b83f950ff88aa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-requests-hawk \
python310-requests-hawk \
python3dist-requests-hawk"

RDEPENDS:${PN} += "python-abi \
python310-mohawk \
python310-requests"

inherit rpm
