SUMMARY = "A Python package for offline access to Vega datasets"
DESCRIPTION = "A Python package for offline access to vega datasets. \
- Provide straightforward access in Python to the datasets made available \
- return the results in the form of a Pandas dataframe \
- wherever dataset size and/or license constraints make it possible, bundle the dataset with the package so that datasets can be loaded in the absence of a web connection"
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python39-vega_datasets-0.9.0-1.9.noarch.rpm"
RPM_HASH = "0d8f4f3626ff939893a5dff2c9b87b8d0d311f500dc916be93cd4bcf43df08ff3c535ffd030fcc9c264d16150b90fccbc585df12622c37865121dd9b3e38f4cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-vega-datasets \
python39-vega-datasets \
python3dist-vega-datasets"

RDEPENDS:${PN} += "python-abi \
python39-pandas"

inherit rpm
