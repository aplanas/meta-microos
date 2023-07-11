SUMMARY = "Allows using distutils2-like setup.cfg with a distribute/setuptools"
DESCRIPTION = "d2to1 (the 'd' is for 'distutils') allows using distutils2-like setup.cfg \
files for a package's metadata with a distribute/setuptools setup.py script. \
It works by providing a distutils2-formatted setup.cfg file containing all of \
a package's metadata, and a very minimal setup.py which will slurp its arguments from the setup.cfg."
LICENSE = "BSD-3-Clause"

PV = "0.2.12.post1"

RPM_NAME = "python311-d2to1-0.2.12.post1-2.14.noarch.rpm"
RPM_HASH = "4f0046aa3d83ee5224941685ead70d2479dfdbe7e4879ce8e7e3b5006b44d133932d0c8cd77f81ebfd3196be2c44e1a20b3634dfbe05fb59f777c761e8edb113"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-d2to1 \
python3.11dist-d2to1 \
python311-d2to1 \
python3dist-d2to1"

RDEPENDS:${PN} += "python-abi"

inherit rpm
