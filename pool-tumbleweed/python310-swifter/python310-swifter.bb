SUMMARY = "Tool to speed up pandas calculations"
DESCRIPTION = "A package which efficiently applies any function to a \
pandas dataframe or series in the fastest available manner"
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python310-swifter-1.4.0-1.1.noarch.rpm"
RPM_HASH = "a9e9207cb8f0558dc34beb334dec9e081307c945a8c2760a7c8fe1fde73e16adfb29979c46ae3f536fdc8c59ce9d47c009421955a443728159c43be0cb4a50b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-swifter \
python310-swifter \
python3dist-swifter"

RDEPENDS:${PN} += "python-abi \
python310-dask-dataframe \
python310-pandas \
python310-psutil \
python310-tqdm"

inherit rpm
