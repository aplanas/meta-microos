SUMMARY = "Parameter exploration and storage of results for numerical simulations"
DESCRIPTION = "pypet is the Python parameter exploration toolkit. pypet manages \
exploration of the parameter space of any numerical simulation in \
Python, thereby storing data into HDF5 files. Moreover, pypet offers \
a data container which gives access to all parameters and results \
from a single source."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python311-pypet-0.6.1-1.1.noarch.rpm"
RPM_HASH = "efac455a0a735573e29cca17de56a6d1a8bfb1b667bd8818c101006cbe111ea13d3a600ff9f42da36edd3d2b894109d724dd5dc19484da66c6df10da5beb5a38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pypet \
python3.11dist-pypet \
python311-pypet \
python3dist-pypet"

RDEPENDS:${PN} += "python-abi \
python311-numpy \
python311-pandas \
python311-scipy \
python311-tables"

inherit rpm
