SUMMARY = "Python utility functions relating to time and filenames"
DESCRIPTION = "A Python module with a number of utility functions for formatting \
timestamps, counting time, and deriving non-overlapping filenames or \
sequences."
LICENSE = "GPL-3.0-only"

PV = "2020.1.29.1857"

RPM_NAME = "python39-shijian-2020.1.29.1857-2.10.noarch.rpm"
RPM_HASH = "12d139f369d6dbf0354796016f80ab486d1b5f26f2424dda910861c301e403a4756e00c1b2fc63a8be6c5f322ecf5143b2880bbf8e5fec803145ae4e916f6acf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-shijian \
python39-shijian \
python3dist-shijian"

RDEPENDS:${PN} += "python39-matplotlib \
python39-numpy \
python39-pandas \
python39-python-dateutil \
python39-scikit-learn \
python39-scipy \
python39-seaborn \
python39-technicolor"

inherit rpm
