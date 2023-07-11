SUMMARY = "Python package for querying metadatdata from sdists/bdists/installed packages"
DESCRIPTION = "This package provides an API for querying the distutils metadata written in \
the PKG-INFO file inside a source distriubtion (an sdist) or a \
binary distribution (e.g., created by running bdist_egg).  It can \
also query the EGG-INFO directory of an installed distribution, and \
the *.egg-info stored in a 'development checkout' \
(e.g, created by running setup.py develop)."
LICENSE = "MIT"

PV = "1.9.6"

RPM_NAME = "python310-pkginfo-1.9.6-2.3.noarch.rpm"
RPM_HASH = "e00f420fea423d22c5a10b3eeabac505fb2f986d43b20cdf0683bcff047f814085035b2bca97929efde2c81eeeeff610469547afe8b7b971624206bbbead1702"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pkginfo \
python310-pkginfo \
python3dist-pkginfo"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
