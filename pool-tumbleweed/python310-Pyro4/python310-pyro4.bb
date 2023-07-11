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

RPM_NAME = "python310-Pyro4-4.82-1.4.noarch.rpm"
RPM_HASH = "0ad09473313fa6474abfb2ee2a5eb80b5f43066dd91be0b08a9f10049e48182434331da0034f74b3780ee59b0a19f5767fa71683c277ef2db0bc7a22923cd733"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-Pyro4"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python310-serpent \
update-alternatives"

inherit rpm
