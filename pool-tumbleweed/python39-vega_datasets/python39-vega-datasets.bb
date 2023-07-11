SUMMARY = "A Python package for offline access to Vega datasets"
DESCRIPTION = "A Python package for offline access to vega datasets. \
- Provide straightforward access in Python to the datasets made available \
- return the results in the form of a Pandas dataframe \
- wherever dataset size and/or license constraints make it possible, bundle the dataset with the package so that datasets can be loaded in the absence of a web connection"
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python39-vega_datasets-0.9.0-1.11.noarch.rpm"
RPM_HASH = "698107ff57bd8a7286b5e3aba281cc0639189d7eb8a784db67a9786ba7b293fff9d70a3e87279c738a3da42dbbc3e16c9848a3b428139733ad601242ff13e4a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-vega-datasets \
python39-vega-datasets \
python3dist-vega-datasets"

RDEPENDS:${PN} += "python-abi \
python39-pandas"

inherit rpm
