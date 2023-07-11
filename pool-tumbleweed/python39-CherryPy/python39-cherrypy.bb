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

RPM_NAME = "python39-CherryPy-18.8.0-3.3.noarch.rpm"
RPM_HASH = "e636191f184b51e1a0c58ae3ba2e62d1cecbb6426a3b4ed63253afe6692896b5ad472cd229d07815ecc0714de412bfef6bba9cf8eef17685c95236d5cc1e0062"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cherrypy \
python39-CherryPy \
python3dist-cherrypy"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi \
python39-cheroot \
python39-jaraco.collections \
python39-more-itertools \
python39-portend \
python39-zc.lockfile"

inherit rpm
