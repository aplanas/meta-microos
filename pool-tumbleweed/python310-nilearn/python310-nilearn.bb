SUMMARY = "Statistical learning tool for neuroimaging"
DESCRIPTION = "Nilearn is a Python module for statistical learning on \
NeuroImaging data."
LICENSE = "BSD-3-Clause"

PV = "0.10.1"

RPM_NAME = "python310-nilearn-0.10.1-2.1.noarch.rpm"
RPM_HASH = "9416fd0f2f12f32d9c2bf7a40e75644290b90c9aa05c13c4edc8370854a1cb63b5cbe986563baa6cadd41a5d5d7318ec5dc72f12f2ee9f7df86c7afb566fdd05"
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
