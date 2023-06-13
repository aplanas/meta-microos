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

RPM_NAME = "python39-Pyro5-5.14-1.3.noarch.rpm"
RPM_HASH = "93dfeb1a418693592ab82209c54d9f649529be145633ea0ee67b9cb6f90214ef07f0bbb002f12329863b3e632047ff89330506caa65dcc4c0d27b4107ef609be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyro5) \
python39-Pyro5 \
python3dist(pyro5)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-serpent \
update-alternatives"

inherit rpm
