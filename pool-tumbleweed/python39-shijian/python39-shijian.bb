SUMMARY = "Python utility functions relating to time and filenames"
DESCRIPTION = "A Python module with a number of utility functions for formatting \
timestamps, counting time, and deriving non-overlapping filenames or \
sequences."
LICENSE = "GPL-3.0-only"

PV = "2020.1.29.1857"

RPM_NAME = "python39-shijian-2020.1.29.1857-2.9.noarch.rpm"
RPM_HASH = "9934f6997cbc536f46daaef43b86006016f726a08fd17fbc4cd3d5d283c5135b5cef7146995b632a509e5e0f425a8eeea3585f1669e5e00e461b7f324546f513"
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
