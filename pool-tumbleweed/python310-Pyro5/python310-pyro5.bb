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

RPM_NAME = "python310-Pyro5-5.14-1.3.noarch.rpm"
RPM_HASH = "7116808efcf29aca24a56d063efe99a6597f40036093efa9a8fb4571c355e5b0687f99aefa6139be9a85b9f252c8b86c900d64ba1d4caf5891ecf4b3943c526c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Pyro5 \
python3.10dist-pyro5 \
python310-Pyro5 \
python3dist-pyro5"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-serpent \
update-alternatives"

inherit rpm
