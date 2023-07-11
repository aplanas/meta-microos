SUMMARY = "Hawk authentication strategy for the requests python library"
DESCRIPTION = "This project allows you to use the python requests library with the hawk \
authentification mechanism. \
 \
Hawk itself does not provide any mechanism for obtaining or transmitting the \
set of shared credentials required, but this project proposes a scheme we use \
across mozilla services projects."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "python311-requests-hawk-1.2.1-1.3.noarch.rpm"
RPM_HASH = "bd562e1782c184fcbb321779f4e8be808ca7bc73e827991ff5e65ca540613064cbf717e2ba217d25d51313c35a4a4cf8459a9bc8503ee7779674cdc6ba7d0e7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-hawk \
python3.11dist-requests-hawk \
python311-requests-hawk \
python3dist-requests-hawk"

RDEPENDS:${PN} += "python-abi \
python311-mohawk \
python311-requests"

inherit rpm
