SUMMARY = "Statistical learning tool for neuroimaging"
DESCRIPTION = "Nilearn is a Python module for statistical learning on \
NeuroImaging data."
LICENSE = "BSD-3-Clause"

PV = "0.10.0"

RPM_NAME = "python311-nilearn-0.10.0-1.1.noarch.rpm"
RPM_HASH = "fad64e3917bfe40a8095e0ea8bd8df35352abf078e8078fa90a2e6d5a1712b603217f0d1ee5b67b1e913ed9c7deef1ef29eae82a9d6f1a5711b5da9d5d4be53d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-nilearn \
python311-nilearn \
python3dist-nilearn"

RDEPENDS:${PN} += "/usr/bin/bash \
python-abi \
python311-joblib \
python311-matplotlib \
python311-nibabel \
python311-numpy \
python311-requests \
python311-scikit-learn \
python311-scipy"

inherit rpm
