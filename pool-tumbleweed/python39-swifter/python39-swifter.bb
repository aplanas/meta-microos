SUMMARY = "Tool to speed up pandas calculations"
DESCRIPTION = "A package which efficiently applies any function to a \
pandas dataframe or series in the fastest available manner"
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python39-swifter-1.4.0-1.1.noarch.rpm"
RPM_HASH = "488514e3c7bad8f8dc342e8232ad45a8152b495baaefab78bf5fe87e324ef7ae05b71fa957e437cbd20aad50171e9013203e23d9384c9cf0295c1c4864075cad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-swifter \
python39-swifter \
python3dist-swifter"

RDEPENDS:${PN} += "python-abi \
python39-dask-dataframe \
python39-pandas \
python39-psutil \
python39-tqdm"

inherit rpm
