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

RPM_NAME = "python310-CherryPy-18.8.0-3.3.noarch.rpm"
RPM_HASH = "df719920c4479c016bfbb7760abbb835edda2a20a8774f70bd784e4d3994f3cec9273fb827968359d3433b45c8936a3c100fa7d8e1c1bf16b390d4c9a373a527"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cherrypy \
python310-CherryPy \
python3dist-cherrypy"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi \
python310-cheroot \
python310-jaraco.collections \
python310-more-itertools \
python310-portend \
python310-zc.lockfile"

inherit rpm
