SUMMARY = "Allows using distutils2-like setup.cfg with a distribute/setuptools"
DESCRIPTION = "d2to1 (the 'd' is for 'distutils') allows using distutils2-like setup.cfg \
files for a package's metadata with a distribute/setuptools setup.py script. \
It works by providing a distutils2-formatted setup.cfg file containing all of \
a package's metadata, and a very minimal setup.py which will slurp its arguments from the setup.cfg."
LICENSE = "BSD-3-Clause"

PV = "0.2.12.post1"

RPM_NAME = "python310-d2to1-0.2.12.post1-2.14.noarch.rpm"
RPM_HASH = "b0e89a5c117112be95aff5997755be2845024bdd1836668cbb0840ec21e241d4fad7eb20d2f24d51c410b619fcacf25929e7807512cc8951c769e6af3ecd04b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-d2to1 \
python310-d2to1 \
python3dist-d2to1"

RDEPENDS:${PN} += "python-abi"

inherit rpm
