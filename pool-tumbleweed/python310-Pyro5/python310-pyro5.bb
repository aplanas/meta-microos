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

RPM_NAME = "python310-Pyro5-5.14-2.3.noarch.rpm"
RPM_HASH = "ce3dea8507f448e9479010305524c27240bdb843204325830fd9a9ca2c72d2c7c9f86d844a9ff578bff320aaab9140c5d3b8b0a0290e0de36e4c4e976eed1af8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyro5 \
python310-Pyro5 \
python3dist-pyro5"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-serpent \
update-alternatives"

inherit rpm
