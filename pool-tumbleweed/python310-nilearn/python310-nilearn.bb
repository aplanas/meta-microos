SUMMARY = "Statistical learning tool for neuroimaging"
DESCRIPTION = "Nilearn is a Python module for statistical learning on \
NeuroImaging data."
LICENSE = "BSD-3-Clause"

PV = "0.10.0"

RPM_NAME = "python310-nilearn-0.10.0-1.1.noarch.rpm"
RPM_HASH = "b3b2d656d66d7d8e66adf3b84690df6290c5b5cdff3a7739a9acecc4b153030c426aff6ea0082ded7a07a9115feb1a8c306d962d4c4f63375e54cfc1be813986"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nilearn \
python3.10dist(nilearn) \
python310-nilearn \
python3dist(nilearn)"

RDEPENDS:${PN} += "/bin/bash \
python(abi) \
python310-joblib \
python310-matplotlib \
python310-nibabel \
python310-numpy \
python310-requests \
python310-scikit-learn \
python310-scipy"

inherit rpm
