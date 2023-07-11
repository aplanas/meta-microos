SUMMARY = "A Python implementation of the actor model"
DESCRIPTION = "Pykka is a Python implementation of the `actor model \
<http://en.wikipedia.org/wiki/Actor_model>`_. The actor model introduces some \
rules to control the sharing of state and cooperation between execution \
units, with which one can build concurrent applications."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "python310-pykka-3.1.1-1.11.noarch.rpm"
RPM_HASH = "297a6555524a23c357509f59fcae562b7a8bf30b1dd20e0852f500c4e0564fda8536ffe35245c15f979ab6f9b1845c93cf6d5cb768fca4dea34749b01a09a477"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pykka \
python310-Pykka \
python310-pykka \
python3dist-pykka"

RDEPENDS:${PN} += "python-abi"

inherit rpm
