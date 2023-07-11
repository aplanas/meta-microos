SUMMARY = "Distributed object middleware for Python (RPC)"
DESCRIPTION = "Pyro means PYthon Remote Objects. \
 \
It is a library for building applications in which objects can talk \
to each other over the network. One can use normal Python method \
calls, with almost every possible parameter and return value type, \
and Pyro takes care of locating the right object on the right system \
to execute the method. It also provides a set of features that enable \
building distributed applications. Pyro is a pure Python library and \
runs on many different platforms and Python versions."
LICENSE = "MIT"

PV = "4.82"

RPM_NAME = "python39-Pyro4-4.82-1.4.noarch.rpm"
RPM_HASH = "d2471fecfe60399e2d1dfe8a87b47c0db75373c52299353f99a428227687bd73446b8652e33e382e28f114151d1edb97f5640243549974be87249aa3afd9891b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Pyro4"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python39-serpent \
update-alternatives"

inherit rpm
