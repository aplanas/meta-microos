SUMMARY = "OpenStack Packaging - python module name to package name map"
DESCRIPTION = "pymod2pkg is a simple python module for translating python module names to \
corresponding package names which is a common problem in the packaging world. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "python3-pymod2pkg-0.26.0-1.10.noarch.rpm"
RPM_HASH = "e13cee58de39acecacb04b91027046d81c86eb7835dce014a565f41d8c171be6e172bca920633bdb7144a3e1e373b4d97affb36e714157e0462545d77597aa2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pymod2pkg \
python3.10dist-pymod2pkg \
python3dist-pymod2pkg"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-distro \
python3-pbr"

inherit rpm
