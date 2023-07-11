SUMMARY = "Scales for Python"
DESCRIPTION = "Mizani is a scales package for graphics."
LICENSE = "BSD-3-Clause"

PV = "0.8.1"

RPM_NAME = "python310-mizani-0.8.1-1.4.noarch.rpm"
RPM_HASH = "dd98bd81236bda75de265fec758512f3883eb038047fdd09b854c28c8e0613297d26526d4fb512cfb4c00fc32dab4935c59ee07fc3415e1daec6485ecadc25ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mizani \
python310-mizani \
python3dist-mizani"

RDEPENDS:${PN} += "python-abi \
python310-matplotlib \
python310-numpy \
python310-palettable \
python310-pandas \
python310-scipy"

inherit rpm
