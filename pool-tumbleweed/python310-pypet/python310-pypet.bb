SUMMARY = "Parameter exploration and storage of results for numerical simulations"
DESCRIPTION = "pypet is the Python parameter exploration toolkit. pypet manages \
exploration of the parameter space of any numerical simulation in \
Python, thereby storing data into HDF5 files. Moreover, pypet offers \
a data container which gives access to all parameters and results \
from a single source."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python310-pypet-0.6.1-1.1.noarch.rpm"
RPM_HASH = "0f7e3d49778e567d805f1e87de7c43e17663c138cd41c81a593e293053f993fa570de60966e55c05a096a3009117f5b369a875057871c69061615db98358770a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pypet \
python310-pypet \
python3dist-pypet"

RDEPENDS:${PN} += "python-abi \
python310-numpy \
python310-pandas \
python310-scipy \
python310-tables"

inherit rpm
