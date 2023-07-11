SUMMARY = "Pandas integration with sklearn"
DESCRIPTION = "This module provides a bridge between Scikit-Learn's machine learning \
methods and pandas-style Data Frames."
LICENSE = "BSD-2-Clause & Zlib"

PV = "2.2.0"

RPM_NAME = "python311-sklearn-pandas-2.2.0-2.5.noarch.rpm"
RPM_HASH = "c0888954ad8a8c330d0fc61bcf08e75d610a452e1324ce6c85fecf1b1748138b8e4a02774a7d53e7cc7b02d3c598c2cb02ae25b4d0afd02e44db81d223c708fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sklearn-pandas \
python3.11dist-sklearn-pandas \
python311-sklearn-pandas \
python3dist-sklearn-pandas"

RDEPENDS:${PN} += "python-abi \
python311-numpy \
python311-pandas \
python311-scikit-learn \
python311-scipy"

inherit rpm
