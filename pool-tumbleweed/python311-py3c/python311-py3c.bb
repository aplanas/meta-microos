SUMMARY = "Python compatibility headers"
DESCRIPTION = "py3c helps porting C extensions to Python 3. \
 \
It provides a guide, and a set of macros to facilitate porting \
and reduce boilerplate."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python311-py3c-1.4-1.2.noarch.rpm"
RPM_HASH = "45bc70861f7a05b7e0d6fc4c81cddc11537b7ceedeb12312dd12dfde7eafafc8bc857b6ca9e2bd37427d91d313344a0001dd72734393b30c4a06e19dd235d38b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-py3c \
python311-py3c \
python3dist-py3c"

RDEPENDS:${PN} += ""

inherit rpm
