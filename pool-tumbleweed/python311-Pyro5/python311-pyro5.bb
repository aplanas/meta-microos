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

RPM_NAME = "python311-Pyro5-5.14-1.3.noarch.rpm"
RPM_HASH = "079950d1edc88eb04be05f0883e899660cd0a60b7c18ea6c1c234ba2d07bef515ab7981f2e658be2d27e5893d7235d9d1ed66d0211d3b1690d1f0bebbc035da9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyro5) \
python311-Pyro5 \
python3dist(pyro5)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-serpent \
update-alternatives"

inherit rpm
