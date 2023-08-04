SUMMARY = "Tool to speed up pandas calculations"
DESCRIPTION = "A package which efficiently applies any function to a \
pandas dataframe or series in the fastest available manner"
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python311-swifter-1.4.0-1.1.noarch.rpm"
RPM_HASH = "e0652ad0a0e4fc3982a66092f182d0a9bf540b82fba58c5e8cba35e77096868ba3454da2e86a9d5159657a1c633fe856ba3a07ab3a2f6946942b14c54535ae83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-swifter \
python3.11dist-swifter \
python311-swifter \
python3dist-swifter"

RDEPENDS:${PN} += "python-abi \
python311-dask-dataframe \
python311-pandas \
python311-psutil \
python311-tqdm"

inherit rpm
