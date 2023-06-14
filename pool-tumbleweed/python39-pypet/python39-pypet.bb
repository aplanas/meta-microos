SUMMARY = "Parameter exploration and storage of results for numerical simulations"
DESCRIPTION = "pypet is the Python parameter exploration toolkit. pypet manages \
exploration of the parameter space of any numerical simulation in \
Python, thereby storing data into HDF5 files. Moreover, pypet offers \
a data container which gives access to all parameters and results \
from a single source."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python39-pypet-0.6.0-2.3.noarch.rpm"
RPM_HASH = "788767bc430da2601b76fa853224317e13d7f5e4b96a4b84efa0857400021f7d0f04bc81c98022a70c9728837f4cd80da1f8afdb13e65cc7948a150faf9a6294"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pypet \
python39-pypet \
python3dist-pypet"

RDEPENDS:${PN} += "python-abi \
python39-numpy \
python39-pandas \
python39-scipy \
python39-tables"

inherit rpm
