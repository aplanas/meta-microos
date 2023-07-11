SUMMARY = "The python pandas[hdf5] extra"
DESCRIPTION = "This package provides the [hdf5] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python311-pandas-hdf5-2.0.2-4.1.noarch.rpm"
RPM_HASH = "653c6de8f2d070733403090f0302b60b29a4b25ea34c63b42e3d8d2eee4279adb78cef271c431f76fd07283c7479b045fa99b40b0ec9b7d2a070f0efb134ec7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-hdf5 \
python311-pandas-hdf5"

RDEPENDS:${PN} += "python311-blosc \
python311-pandas \
python311-tables"

inherit rpm
