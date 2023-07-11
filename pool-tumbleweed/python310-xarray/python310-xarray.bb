SUMMARY = "N-D labeled arrays and datasets in Python"
DESCRIPTION = "xarray (formerly xray) is a python-pandas-like and pandas-compatible \
toolkit for analytics on multi-dimensional arrays. It provides \
N-dimensional variants of the python-pandas labeled data structures, \
rather than the tabular data that pandas uses. \
 \
The Common Data Model for self-describing scientific data is used. \
The dataset is an in-memory representation of a netCDF file."
LICENSE = "Apache-2.0"

PV = "2023.5.0"

RPM_NAME = "python310-xarray-2023.5.0-1.3.noarch.rpm"
RPM_HASH = "86b1a7cc4b8b19784eb4c9ec3a920cb2e417ca2c15b362225eaadd34d1b97dbcbc24e4c4677b841bc8e6c5763aab4ce6c31eaa80aaf5f4c1410460211951e7a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-xarray \
python310-xarray \
python310-xray \
python3dist-xarray"

RDEPENDS:${PN} += "python-abi \
python310-numpy \
python310-packaging \
python310-pandas"

inherit rpm
