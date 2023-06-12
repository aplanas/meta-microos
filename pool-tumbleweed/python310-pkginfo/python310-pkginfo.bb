SUMMARY = "Python package for querying metadatdata from sdists/bdists/installed packages"
DESCRIPTION = "This package provides an API for querying the distutils metadata written in \
the PKG-INFO file inside a source distriubtion (an sdist) or a \
binary distribution (e.g., created by running bdist_egg).  It can \
also query the EGG-INFO directory of an installed distribution, and \
the *.egg-info stored in a 'development checkout' \
(e.g, created by running setup.py develop)."
LICENSE = "MIT"

PV = "1.9.6"

RPM_NAME = "python310-pkginfo-1.9.6-2.1.noarch.rpm"
RPM_HASH = "e6b7d7db0b44ba80eb987d2809bfa0ffcb82b089fba76f2bb26020c1246aa9bea2d820a9b5b0e3d6ceca194c2d2adc3b3f5b74fb7b55d74d9751ed729be1ba3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pkginfo \
python3.10dist(pkginfo) \
python310-pkginfo \
python3dist(pkginfo)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-setuptools \
update-alternatives"

inherit rpm
