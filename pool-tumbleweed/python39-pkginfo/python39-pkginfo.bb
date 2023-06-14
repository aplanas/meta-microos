SUMMARY = "Python package for querying metadatdata from sdists/bdists/installed packages"
DESCRIPTION = "This package provides an API for querying the distutils metadata written in \
the PKG-INFO file inside a source distriubtion (an sdist) or a \
binary distribution (e.g., created by running bdist_egg).  It can \
also query the EGG-INFO directory of an installed distribution, and \
the *.egg-info stored in a 'development checkout' \
(e.g, created by running setup.py develop)."
LICENSE = "MIT"

PV = "1.9.6"

RPM_NAME = "python39-pkginfo-1.9.6-2.1.noarch.rpm"
RPM_HASH = "d6c7f59cbfee453ace663561bcbc924256ac46851eb7ddc3b37b76328267504a642143531f91b973c240023e1e8b8d982c26ddc753a2268d3dc06786919b62d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pkginfo \
python39-pkginfo \
python3dist-pkginfo"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
