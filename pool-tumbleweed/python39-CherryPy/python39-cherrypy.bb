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

RPM_NAME = "python39-CherryPy-18.8.0-3.1.noarch.rpm"
RPM_HASH = "1311dc7bebe7a223dbf517691a1a551fb3626d13a22eedf305ebd06b57cdcf3ef28c8d7ad5b47495b848b6d854469c8eb8fe724e06f315dc3ea8b46fafbf96bd"
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
