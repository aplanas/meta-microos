SUMMARY = "Serial support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature serial"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-Twisted-serial-22.10.0-7.1.noarch.rpm"
RPM_HASH = "f73270b5af24e155174a48ef0171f835bf352470aa37c6e962f691d08618d4413a4266cffedcf5cc7de3dbf9bde4f4c651baac68e4f2cf83d3081b3d3c5b9ff5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-Twisted-serial"

RDEPENDS:${PN} += "python310-Twisted \
python310-pyserial"

inherit rpm
