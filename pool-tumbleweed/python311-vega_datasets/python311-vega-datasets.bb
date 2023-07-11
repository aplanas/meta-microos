SUMMARY = "A Python package for offline access to Vega datasets"
DESCRIPTION = "A Python package for offline access to vega datasets. \
- Provide straightforward access in Python to the datasets made available \
- return the results in the form of a Pandas dataframe \
- wherever dataset size and/or license constraints make it possible, bundle the dataset with the package so that datasets can be loaded in the absence of a web connection"
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python311-vega_datasets-0.9.0-1.11.noarch.rpm"
RPM_HASH = "9c24bb46341e31468048e44aed9ef863313f05cc6b761469355cb6b739f4589316b1b276309d1cc098c99e2c3ca279fb6100c8f0f8369d160c34aa87481e2ee9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vega-datasets \
python3.11dist-vega-datasets \
python311-vega-datasets \
python3dist-vega-datasets"

RDEPENDS:${PN} += "python-abi \
python311-pandas"

inherit rpm
