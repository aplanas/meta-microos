SUMMARY = "A Python implementation of the actor model"
DESCRIPTION = "Pykka is a Python implementation of the `actor model \
<http://en.wikipedia.org/wiki/Actor_model>`_. The actor model introduces some \
rules to control the sharing of state and cooperation between execution \
units, with which one can build concurrent applications."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "python39-pykka-3.1.1-1.9.noarch.rpm"
RPM_HASH = "05493d84ded9d8c60ab7414c278daf4facf65ebaa12dd2d71c8712437d17ccef01667670c3b3874b1ab8e7704e530c0472a4c33e5114b41c2f7f284621932d9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pykka \
python39-Pykka \
python39-pykka \
python3dist-pykka"

RDEPENDS:${PN} += "python-abi"

inherit rpm
