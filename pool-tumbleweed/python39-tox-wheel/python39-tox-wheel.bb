SUMMARY = "A Tox plugin that builds and installs wheels instead of sdist"
DESCRIPTION = "A Tox plugin that builds and installs wheels instead of sdist."
LICENSE = "BSD-2-Clause"

PV = "1.0.0"

RPM_NAME = "python39-tox-wheel-1.0.0-1.5.noarch.rpm"
RPM_HASH = "4977d086d90a3aefba250c6580cf92156c93d8522d89bcd58f19eb241603cb9f158a3b331cdd4fa9b34b91420a01271af0e456623c4eb0888a46fda8776650b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tox-wheel \
python39-tox-wheel \
python3dist-tox-wheel"

RDEPENDS:${PN} += "python-abi \
python39-tox \
python39-wheel"

inherit rpm
