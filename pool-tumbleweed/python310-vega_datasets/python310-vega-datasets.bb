SUMMARY = "A Python package for offline access to Vega datasets"
DESCRIPTION = "A Python package for offline access to vega datasets. \
- Provide straightforward access in Python to the datasets made available \
- return the results in the form of a Pandas dataframe \
- wherever dataset size and/or license constraints make it possible, bundle the dataset with the package so that datasets can be loaded in the absence of a web connection"
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python310-vega_datasets-0.9.0-1.9.noarch.rpm"
RPM_HASH = "f4c027ee82bd0f5e328c2841494a3dc92646c208c2db9f6592ecca45972ea48c2666037a3c5fc1942b73cfbca5d02aa14c262a5e00c2c38e518ed4407126e4ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vega_datasets \
python3.10dist(vega-datasets) \
python310-vega_datasets \
python3dist(vega-datasets)"
RDEPENDS:${PN} += "python(abi) \
python310-pandas"

inherit rpm
