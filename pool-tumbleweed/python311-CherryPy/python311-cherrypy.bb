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

RPM_NAME = "python311-CherryPy-18.8.0-3.1.noarch.rpm"
RPM_HASH = "981977c3c5523cc12b21493285fbdfb34ff7fe9f2176cc28bacb0e88f34af4ca7a08d66aa6eca8b330e3008eb5c728c0502f04365ea2f761b245735dc25988c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cherrypy) \
python311-CherryPy \
python3dist(cherrypy)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
alts \
python(abi) \
python311-cheroot \
python311-jaraco.collections \
python311-more-itertools \
python311-portend \
python311-zc.lockfile"

inherit rpm
