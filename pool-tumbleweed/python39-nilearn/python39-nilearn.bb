SUMMARY = "Statistical learning tool for neuroimaging"
DESCRIPTION = "Nilearn is a Python module for statistical learning on \
NeuroImaging data."
LICENSE = "BSD-3-Clause"

PV = "0.10.1"

RPM_NAME = "python39-nilearn-0.10.1-2.1.noarch.rpm"
RPM_HASH = "60fe25961562d63716a4d1dffdd2deca0f463063cc01ec5dad238e21571d4fb10bb74cbab8ff0f8ec1df7fb202b1a7284d4135a340d16f4a47aaeeca9b7eaff6"
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
