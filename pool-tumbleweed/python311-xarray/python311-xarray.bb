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

RPM_NAME = "python311-xarray-2023.5.0-1.1.noarch.rpm"
RPM_HASH = "9b23da0b126db72ff058e66f56d9258c6c0c51ba16e8170f191b6c87abd2dd857db101e8b2013c687b087aabfb822c89ea09d782ef1f4c16d588c426553ee118"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-xarray \
python311-xarray \
python311-xray \
python3dist-xarray"

RDEPENDS:${PN} += "python-abi \
python311-numpy \
python311-packaging \
python311-pandas"

inherit rpm
