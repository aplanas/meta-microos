SUMMARY = "A Python implementation of the actor model"
DESCRIPTION = "Pykka is a Python implementation of the `actor model \
<http://en.wikipedia.org/wiki/Actor_model>`_. The actor model introduces some \
rules to control the sharing of state and cooperation between execution \
units, with which one can build concurrent applications."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "python39-pykka-3.1.1-1.11.noarch.rpm"
RPM_HASH = "268275a00ada810f05783a8ef59f90ebfbdb7e50dc12fb532cb77eedcb01273dc58067687a532960bcee776319caf033fb2e9679e2c0422e51702c3a46287cff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pykka \
python39-Pykka \
python39-pykka \
python3dist-pykka"

RDEPENDS:${PN} += "python-abi"

inherit rpm
