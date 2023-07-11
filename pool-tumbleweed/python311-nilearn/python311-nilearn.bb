SUMMARY = "Statistical learning tool for neuroimaging"
DESCRIPTION = "Nilearn is a Python module for statistical learning on \
NeuroImaging data."
LICENSE = "BSD-3-Clause"

PV = "0.10.1"

RPM_NAME = "python311-nilearn-0.10.1-1.1.noarch.rpm"
RPM_HASH = "8af20994b97467f0f03533f025bc33c31136ed8643cb1350750fe20c9b8262aa5eb6209c5db8392f97431afbb1f584eef129a70265d21eb6f2a8e27b86463d2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nilearn \
python3.11dist-nilearn \
python311-nilearn \
python3dist-nilearn"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
python-abi \
python311-joblib \
python311-matplotlib \
python311-nibabel \
python311-numpy \
python311-packaging \
python311-pandas \
python311-requests \
python311-scikit-learn \
python311-scipy"

inherit rpm
