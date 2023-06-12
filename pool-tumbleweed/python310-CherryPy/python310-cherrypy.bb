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

RPM_NAME = "python310-CherryPy-18.8.0-3.1.noarch.rpm"
RPM_HASH = "26d9e6c4e323f89d56f44e2180ce28d58729a46c2cb319806ae4d0d729739ecfd1b9db02e30e61c219c66dc30aa72d51995f82c7b4daa889b101e3313fa78bfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-CherryPy \
python3.10dist(cherrypy) \
python310-CherryPy \
python3dist(cherrypy)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
alts \
python(abi) \
python310-cheroot \
python310-jaraco.collections \
python310-more-itertools \
python310-portend \
python310-zc.lockfile"

inherit rpm
