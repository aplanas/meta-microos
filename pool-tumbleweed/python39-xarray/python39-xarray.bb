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

RPM_NAME = "python39-xarray-2023.5.0-1.1.noarch.rpm"
RPM_HASH = "587c8efbeb2426a63251aaf98c840dd8752b635b378f29fcb19d2a0905b50389e5d60a9d33dba8c7e06d983101651d7e100ada526a9e377280f36a6d56e1f305"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xarray \
python39-xarray \
python39-xray \
python3dist-xarray"

RDEPENDS:${PN} += "python-abi \
python39-numpy \
python39-packaging \
python39-pandas"

inherit rpm
