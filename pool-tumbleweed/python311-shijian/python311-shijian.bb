SUMMARY = "Python utility functions relating to time and filenames"
DESCRIPTION = "A Python module with a number of utility functions for formatting \
timestamps, counting time, and deriving non-overlapping filenames or \
sequences."
LICENSE = "GPL-3.0-only"

PV = "2020.1.29.1857"

RPM_NAME = "python311-shijian-2020.1.29.1857-2.10.noarch.rpm"
RPM_HASH = "8009c96ac3d4661287b8951f7e2c86d807c566284b3da8fcf895ee44554babf1a73365ecacebc04eb5a08a1d58f507277389d20fafd5f79d1b051ba12a194f93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-shijian \
python3.11dist-shijian \
python311-shijian \
python3dist-shijian"

RDEPENDS:${PN} += "python311-matplotlib \
python311-numpy \
python311-pandas \
python311-python-dateutil \
python311-scikit-learn \
python311-scipy \
python311-seaborn \
python311-technicolor"

inherit rpm
