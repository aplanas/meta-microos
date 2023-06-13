SUMMARY = "Hawk authentication strategy for the requests python library"
DESCRIPTION = "This project allows you to use the python requests library with the hawk \
authentification mechanism. \
 \
Hawk itself does not provide any mechanism for obtaining or transmitting the \
set of shared credentials required, but this project proposes a scheme we use \
across mozilla services projects."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "python310-requests-hawk-1.2.1-1.1.noarch.rpm"
RPM_HASH = "f549c3b4a7f784e546bf058c8d3aa06ea0f29759ccc30d3525c9f708304a00efaa5b1c57b08e089f14f6f37955f456af35a5e66d822e2208f77f6046825da133"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-hawk \
python3.10dist(requests-hawk) \
python310-requests-hawk \
python3dist(requests-hawk)"

RDEPENDS:${PN} += "python(abi) \
python310-mohawk \
python310-requests"

inherit rpm
