SUMMARY = "Statistical learning tool for neuroimaging"
DESCRIPTION = "Nilearn is a Python module for statistical learning on \
NeuroImaging data."
LICENSE = "BSD-3-Clause"

PV = "0.10.1"

RPM_NAME = "python39-nilearn-0.10.1-1.1.noarch.rpm"
RPM_HASH = "cb83f5b8495d1bf6c3e718b0eaa87d3b2404421af25522775eeb87feff6586f4b1b8ee5ad37fc3b05ddabb70181626fb1094161902307e0c8d498a5c6d1d049b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nilearn \
python39-nilearn \
python3dist-nilearn"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
python-abi \
python39-joblib \
python39-matplotlib \
python39-nibabel \
python39-numpy \
python39-packaging \
python39-pandas \
python39-requests \
python39-scikit-learn \
python39-scipy"

inherit rpm
