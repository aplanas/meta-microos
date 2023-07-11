SUMMARY = "Python package for querying metadatdata from sdists/bdists/installed packages"
DESCRIPTION = "This package provides an API for querying the distutils metadata written in \
the PKG-INFO file inside a source distriubtion (an sdist) or a \
binary distribution (e.g., created by running bdist_egg).  It can \
also query the EGG-INFO directory of an installed distribution, and \
the *.egg-info stored in a 'development checkout' \
(e.g, created by running setup.py develop)."
LICENSE = "MIT"

PV = "1.9.6"

RPM_NAME = "python39-pkginfo-1.9.6-2.3.noarch.rpm"
RPM_HASH = "6e9110b2f24df3f9348b535b4d0dc626e465de0b07e947218b302a83fb3cd7423ab30b61c9972060f47ba31285b876d1bf066b0b843e7487ac816b56fafffdf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pkginfo \
python39-pkginfo \
python3dist-pkginfo"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
