SUMMARY = "Statistical learning tool for neuroimaging"
DESCRIPTION = "Nilearn is a Python module for statistical learning on \
NeuroImaging data."
LICENSE = "BSD-3-Clause"

PV = "0.10.1"

RPM_NAME = "python310-nilearn-0.10.1-1.1.noarch.rpm"
RPM_HASH = "01e0a475c6caa3f5314283beb5d8beb196b6d67a3080092b1ebb5280289a356790bb4f9ca6806e89fee3403e66386620e6628cff961f62257e0a08f3c6e8cdda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-nilearn \
python310-nilearn \
python3dist-nilearn"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
python-abi \
python310-joblib \
python310-matplotlib \
python310-nibabel \
python310-numpy \
python310-packaging \
python310-pandas \
python310-requests \
python310-scikit-learn \
python310-scipy"

inherit rpm
