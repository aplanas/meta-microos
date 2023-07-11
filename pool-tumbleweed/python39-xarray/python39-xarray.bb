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

RPM_NAME = "python39-xarray-2023.5.0-1.3.noarch.rpm"
RPM_HASH = "fd2a5cfcdbe9d66fb475905a070a75e4451d989369093e268e27b1d2e76b5cf3c6e4c6e271e51d47b36e169f2d4d8f4c3c2f466b3230769a33e90f2378a7bba5"
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
