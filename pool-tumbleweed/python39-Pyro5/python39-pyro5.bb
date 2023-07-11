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

PV = "5.14"

RPM_NAME = "python39-Pyro5-5.14-2.3.noarch.rpm"
RPM_HASH = "60961698946d12a8d8c46c68c0723e98fc3558cc202c9bb74c87de549ce95416097f3b31400752eb5757b10037085f575025bbc6fb665763740d847d78b91392"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyro5 \
python39-Pyro5 \
python3dist-pyro5"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-serpent \
update-alternatives"

inherit rpm
