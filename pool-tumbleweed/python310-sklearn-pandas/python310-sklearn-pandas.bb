SUMMARY = "Pandas integration with sklearn"
DESCRIPTION = "This module provides a bridge between Scikit-Learn's machine learning \
methods and pandas-style Data Frames."
LICENSE = "BSD-2-Clause & Zlib"

PV = "2.2.0"

RPM_NAME = "python310-sklearn-pandas-2.2.0-2.3.noarch.rpm"
RPM_HASH = "e1a3bbac9b0e32b23cf1aa6303bdcdc66e18eefb1b4a31662d3d7e52b490b541e42b279e0baef1e9d917d805075d3817f5209bc5e137593dd3d903aa009b6262"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sklearn-pandas \
python3.10dist(sklearn-pandas) \
python310-sklearn-pandas \
python3dist(sklearn-pandas)"

RDEPENDS:${PN} += "python(abi) \
python310-numpy \
python310-pandas \
python310-scikit-learn \
python310-scipy"

inherit rpm
