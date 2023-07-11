SUMMARY = "A Python implementation of the actor model"
DESCRIPTION = "Pykka is a Python implementation of the `actor model \
<http://en.wikipedia.org/wiki/Actor_model>`_. The actor model introduces some \
rules to control the sharing of state and cooperation between execution \
units, with which one can build concurrent applications."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "python311-pykka-3.1.1-1.11.noarch.rpm"
RPM_HASH = "2d7e006f3df26fb8cb44c5977bdb5f1479a848708dd725dcc5428e6b49abc158d444484560f4d7001aed7ec544761263282306959b1068193d9aabc6af8155bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Pykka \
python3-pykka \
python3.11dist-pykka \
python311-Pykka \
python311-pykka \
python3dist-pykka"

RDEPENDS:${PN} += "python-abi"

inherit rpm
