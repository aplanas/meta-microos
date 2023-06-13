SUMMARY = "Python utility functions relating to time and filenames"
DESCRIPTION = "A Python module with a number of utility functions for formatting \
timestamps, counting time, and deriving non-overlapping filenames or \
sequences."
LICENSE = "GPL-3.0-only"

PV = "2020.1.29.1857"

RPM_NAME = "python310-shijian-2020.1.29.1857-2.9.noarch.rpm"
RPM_HASH = "dcd6bdc048217af43850a846ef56e60f924db76a0bcc4a62f33d13d433d1a64d0f3d6feeca7df354b09cf4fc3634854f2a8b0e56981d0acfaf16ce9858f36b6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-shijian \
python3.10dist(shijian) \
python310-shijian \
python3dist(shijian)"

RDEPENDS:${PN} += "python310-matplotlib \
python310-numpy \
python310-pandas \
python310-python-dateutil \
python310-scikit-learn \
python310-scipy \
python310-seaborn \
python310-technicolor"

inherit rpm
