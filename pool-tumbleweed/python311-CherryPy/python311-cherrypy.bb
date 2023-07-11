SUMMARY = "Object-Oriented HTTP framework"
DESCRIPTION = "CherryPy is a pythonic, object-oriented HTTP framework. \
 \
CherryPy allows developers to build web applications in much the same way they \
would build any other object-oriented Python program. This usually results in \
smaller source code developed in less time. \
 \
CherryPy is now more than three years old and it is has proven very fast and \
stable. It is being used in production by many sites, from the simplest ones \
to the most demanding ones. \
 \
Oh, and most importantly: CherryPy is fun to work with :-)"
LICENSE = "BSD-3-Clause"

PV = "18.8.0"

RPM_NAME = "python311-CherryPy-18.8.0-3.3.noarch.rpm"
RPM_HASH = "a7841f7c3fbcb412c576286eab48ad043729ed3ece7b5e1378ef3f66f9a0525a76cc0643962ab0a1e3b0fa7e5c005852b7562c3c1a7a75c51cac5b75245910e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-CherryPy \
python3.11dist-cherrypy \
python311-CherryPy \
python3dist-cherrypy"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311-cheroot \
python311-jaraco.collections \
python311-more-itertools \
python311-portend \
python311-zc.lockfile"

inherit rpm
