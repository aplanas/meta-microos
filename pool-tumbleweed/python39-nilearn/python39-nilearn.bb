SUMMARY = "Statistical learning tool for neuroimaging"
DESCRIPTION = "Nilearn is a Python module for statistical learning on \
NeuroImaging data."
LICENSE = "BSD-3-Clause"

PV = "0.10.0"

RPM_NAME = "python39-nilearn-0.10.0-1.1.noarch.rpm"
RPM_HASH = "73a75afc29655b482abeb685065f08860e33c46f18adb846ef83c280164cd9d5b5ef95706a95f5b94bb7552249605e33ca0b7b033dce0e1f887bc4a944a99633"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nilearn \
python39-nilearn \
python3dist-nilearn"

RDEPENDS:${PN} += "/usr/bin/bash \
python-abi \
python39-joblib \
python39-matplotlib \
python39-nibabel \
python39-numpy \
python39-requests \
python39-scikit-learn \
python39-scipy"

inherit rpm
