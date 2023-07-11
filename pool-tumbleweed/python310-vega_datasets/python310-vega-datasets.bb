SUMMARY = "A Python package for offline access to Vega datasets"
DESCRIPTION = "A Python package for offline access to vega datasets. \
- Provide straightforward access in Python to the datasets made available \
- return the results in the form of a Pandas dataframe \
- wherever dataset size and/or license constraints make it possible, bundle the dataset with the package so that datasets can be loaded in the absence of a web connection"
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python310-vega_datasets-0.9.0-1.11.noarch.rpm"
RPM_HASH = "875dd9a015c84cd0daac10ad4c0fe8a2224d322312a65fe2e7470a4325001bb6a0af27296eb0b5acb5d3962b24b1364c92bdd3cc7e3999368fecaa5234c5b91f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-vega-datasets \
python310-vega-datasets \
python3dist-vega-datasets"

RDEPENDS:${PN} += "python-abi \
python310-pandas"

inherit rpm
