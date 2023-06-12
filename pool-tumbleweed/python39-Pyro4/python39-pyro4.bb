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

RPM_NAME = "python39-Pyro4-4.82-1.3.noarch.rpm"
RPM_HASH = "e860689c6e5046b7529f9f34bd7a05f92597b4bd4ad943e845de0f9499e26d5cbef470164b54b3a15cb3cf2dc4af18efa8efd4d5e413eb5f8c308fbaded872aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyro4) \
python39-Pyro4 \
python3dist(pyro4)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-serpent \
update-alternatives"

inherit rpm
