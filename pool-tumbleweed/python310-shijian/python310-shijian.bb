SUMMARY = "Python utility functions relating to time and filenames"
DESCRIPTION = "A Python module with a number of utility functions for formatting \
timestamps, counting time, and deriving non-overlapping filenames or \
sequences."
LICENSE = "GPL-3.0-only"

PV = "2020.1.29.1857"

RPM_NAME = "python310-shijian-2020.1.29.1857-2.10.noarch.rpm"
RPM_HASH = "46e893e9b632e54214ec8e73a84f516f59298490307ff51082662c1f961ad6e0ff8ef3fe660739561cb67750a49ac913a111f767ee632643c994394307e246df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-shijian \
python310-shijian \
python3dist-shijian"

RDEPENDS:${PN} += "python310-matplotlib \
python310-numpy \
python310-pandas \
python310-python-dateutil \
python310-scikit-learn \
python310-scipy \
python310-seaborn \
python310-technicolor"

inherit rpm
