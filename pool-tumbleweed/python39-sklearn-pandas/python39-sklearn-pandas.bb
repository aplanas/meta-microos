SUMMARY = "Pandas integration with sklearn"
DESCRIPTION = "This module provides a bridge between Scikit-Learn's machine learning \
methods and pandas-style Data Frames."
LICENSE = "BSD-2-Clause & Zlib"

PV = "2.2.0"

RPM_NAME = "python39-sklearn-pandas-2.2.0-2.5.noarch.rpm"
RPM_HASH = "497f50cafdd74d276d39d80c61e8642892a5100023bdf6e6bc975312fb6b95db66b429ec6b9490e9fe8ed909b53f2bb5ace822265bc645cf20112593c94ba24f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sklearn-pandas \
python39-sklearn-pandas \
python3dist-sklearn-pandas"

RDEPENDS:${PN} += "python-abi \
python39-numpy \
python39-pandas \
python39-scikit-learn \
python39-scipy"

inherit rpm
