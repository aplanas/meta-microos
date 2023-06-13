SUMMARY = "Python compatibility headers"
DESCRIPTION = "py3c helps porting C extensions to Python 3. \
 \
It provides a guide, and a set of macros to facilitate porting \
and reduce boilerplate."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python39-py3c-1.4-1.2.noarch.rpm"
RPM_HASH = "6e7bd22cfa96115dd41f291afd694283563642d8af64e62bc1f705fa5cbe8c42770f16d53031039d047fbd2b875f5ac409b194353063d730cdd92e619b7f88b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(py3c) \
python39-py3c \
python3dist(py3c)"

RDEPENDS:${PN} += ""

inherit rpm
