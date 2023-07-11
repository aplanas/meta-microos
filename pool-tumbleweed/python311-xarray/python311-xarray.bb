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

RPM_NAME = "python311-xarray-2023.5.0-1.3.noarch.rpm"
RPM_HASH = "994eadfb6b30c5605ff730968a67994b153d92229ebd1ee1cd59b7d609a0bf605a812258fc5e866f9a9a0174ccd717f92d6a79883318692099fdfc252c87232e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xarray \
python3-xray \
python3.11dist-xarray \
python311-xarray \
python311-xray \
python3dist-xarray"

RDEPENDS:${PN} += "python-abi \
python311-numpy \
python311-packaging \
python311-pandas"

inherit rpm
