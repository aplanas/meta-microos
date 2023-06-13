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

RPM_NAME = "python310-Pyro4-4.82-1.3.noarch.rpm"
RPM_HASH = "82cd919cf399446519bb14b8f1190d1d5aafcc68db1da0894f1741ca47d792a31a2317f9a0a631797b3bb67f77ca2e7edd3c9d42ab7869a69c3325736c319fda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Pyro4 \
python3.10dist(pyro4) \
python310-Pyro4 \
python3dist(pyro4)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-serpent \
update-alternatives"

inherit rpm
