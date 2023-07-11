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

RPM_NAME = "python311-Pyro5-5.14-2.3.noarch.rpm"
RPM_HASH = "febacdbfec60fd0c27086e29912616f99d372f7555832f711cefee792045c637e335aa2559abf7c25e3616959e9c61af175344a1d761e1804c015f783ff3f57a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Pyro5 \
python3.11dist-pyro5 \
python311-Pyro5 \
python3dist-pyro5"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-serpent \
update-alternatives"

inherit rpm
