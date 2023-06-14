SUMMARY = "Allows using distutils2-like setup.cfg with a distribute/setuptools"
DESCRIPTION = "d2to1 (the 'd' is for 'distutils') allows using distutils2-like setup.cfg \
files for a package's metadata with a distribute/setuptools setup.py script. \
It works by providing a distutils2-formatted setup.cfg file containing all of \
a package's metadata, and a very minimal setup.py which will slurp its arguments from the setup.cfg."
LICENSE = "BSD-3-Clause"

PV = "0.2.12.post1"

RPM_NAME = "python39-d2to1-0.2.12.post1-2.13.noarch.rpm"
RPM_HASH = "440db41e5134d33bb135f01d323b2c53b7d5a4a0875b78a6e7bf315ad57040e81306b1739badaac2b4b7c28b47007b8bf5c24f5046b37514883fd9af81c28e70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-d2to1 \
python39-d2to1 \
python3dist-d2to1"

RDEPENDS:${PN} += "python-abi"

inherit rpm
