SUMMARY = "Python package for querying metadatdata from sdists/bdists/installed packages"
DESCRIPTION = "This package provides an API for querying the distutils metadata written in \
the PKG-INFO file inside a source distriubtion (an sdist) or a \
binary distribution (e.g., created by running bdist_egg).  It can \
also query the EGG-INFO directory of an installed distribution, and \
the *.egg-info stored in a 'development checkout' \
(e.g, created by running setup.py develop)."
LICENSE = "MIT"

PV = "1.9.6"

RPM_NAME = "python311-pkginfo-1.9.6-2.3.noarch.rpm"
RPM_HASH = "a5a35bfb44f6707035bf242aa690cc51a8d1c539e28e7fe26e465b9fddba7cd85d40ee82437d627fe62abd0a88422f4f5352149f80b1705002c1edab68dbb7f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pkginfo \
python3.11dist-pkginfo \
python311-pkginfo \
python3dist-pkginfo"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
