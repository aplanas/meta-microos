SUMMARY = "Parameter exploration and storage of results for numerical simulations"
DESCRIPTION = "pypet is the Python parameter exploration toolkit. pypet manages \
exploration of the parameter space of any numerical simulation in \
Python, thereby storing data into HDF5 files. Moreover, pypet offers \
a data container which gives access to all parameters and results \
from a single source."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python39-pypet-0.6.1-1.1.noarch.rpm"
RPM_HASH = "c97fc43167d561b1c6f73c12a39f017c4c7c8240cc9b668521e910367f345229be3474c2a2f6e39259b6a22aadd7d48dd5ba7f442fb2685910df51bb5a03f9d4"
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
