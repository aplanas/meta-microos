SUMMARY = "Python bindings for Z3"
DESCRIPTION = "Python bindings for the Z3 library."
LICENSE = "MIT"

PV = "4.12.2"

RPM_NAME = "python3-z3-4.12.2-1.1.noarch.rpm"
RPM_HASH = "cea03fcb53e50db475811e97d5baa9a03f612758a7828b3dc3c45cdd55bcc99f6b0fa0d45505c1a257a67445dfb3d2952ef281081d5193158e6b5f690974bfe0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-z3"

RDEPENDS:${PN} += "libz3-4-12 \
python-abi"

inherit rpm
