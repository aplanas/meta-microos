SUMMARY = "Allows using distutils2-like setup.cfg with a distribute/setuptools"
DESCRIPTION = "d2to1 (the 'd' is for 'distutils') allows using distutils2-like setup.cfg \
files for a package's metadata with a distribute/setuptools setup.py script. \
It works by providing a distutils2-formatted setup.cfg file containing all of \
a package's metadata, and a very minimal setup.py which will slurp its arguments from the setup.cfg."
LICENSE = "BSD-3-Clause"

PV = "0.2.12.post1"

RPM_NAME = "python39-d2to1-0.2.12.post1-2.14.noarch.rpm"
RPM_HASH = "8a41e73b03cd93a654a84a9065fc588695e4175d41fbd8ff3747e3f914c340aa7cf6d60598378c4c1aeebe6e7040fce1a277bb5f3963d4bfb86c26ad3f2f82a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-d2to1 \
python39-d2to1 \
python3dist-d2to1"

RDEPENDS:${PN} += "python-abi"

inherit rpm
