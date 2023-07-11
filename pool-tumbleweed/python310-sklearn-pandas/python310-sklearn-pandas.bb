SUMMARY = "Pandas integration with sklearn"
DESCRIPTION = "This module provides a bridge between Scikit-Learn's machine learning \
methods and pandas-style Data Frames."
LICENSE = "BSD-2-Clause & Zlib"

PV = "2.2.0"

RPM_NAME = "python310-sklearn-pandas-2.2.0-2.5.noarch.rpm"
RPM_HASH = "dafbc65bbf9c7036faa35cd6ae27e543906af2e9bf509e8daedcf1489ace3a4acaa98a4019a633aa0b1409c57635cd89fe54a2c5da251aa02f8936ad5c3c96fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sklearn-pandas \
python310-sklearn-pandas \
python3dist-sklearn-pandas"

RDEPENDS:${PN} += "python-abi \
python310-numpy \
python310-pandas \
python310-scikit-learn \
python310-scipy"

inherit rpm
