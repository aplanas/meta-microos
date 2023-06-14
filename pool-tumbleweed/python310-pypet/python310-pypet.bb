SUMMARY = "Parameter exploration and storage of results for numerical simulations"
DESCRIPTION = "pypet is the Python parameter exploration toolkit. pypet manages \
exploration of the parameter space of any numerical simulation in \
Python, thereby storing data into HDF5 files. Moreover, pypet offers \
a data container which gives access to all parameters and results \
from a single source."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python310-pypet-0.6.0-2.3.noarch.rpm"
RPM_HASH = "65baae3aa807e3a449ce4b00bae02960cec05e0bc830b12ab887edddbfbeb9bcb08191de99355b26baf24629cba279befba9347a9e0e4d88ac4686d2cb3efd7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pypet \
python3.10dist-pypet \
python310-pypet \
python3dist-pypet"

RDEPENDS:${PN} += "python-abi \
python310-numpy \
python310-pandas \
python310-scipy \
python310-tables"

inherit rpm
