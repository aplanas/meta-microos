SUMMARY = "Statistical learning tool for neuroimaging"
DESCRIPTION = "Nilearn is a Python module for statistical learning on \
NeuroImaging data."
LICENSE = "BSD-3-Clause"

PV = "0.10.1"

RPM_NAME = "python311-nilearn-0.10.1-2.1.noarch.rpm"
RPM_HASH = "9a18647b610b255eaccc9e9d65d8de0f45f76253071f8673d815f5b53fea954cfdba78462c7944c087238a12ae817247355980be11202001eb82b6c8e534490c"
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
