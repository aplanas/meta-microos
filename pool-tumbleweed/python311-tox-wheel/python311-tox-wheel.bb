SUMMARY = "A Tox plugin that builds and installs wheels instead of sdist"
DESCRIPTION = "A Tox plugin that builds and installs wheels instead of sdist."
LICENSE = "BSD-2-Clause"

PV = "1.0.0"

RPM_NAME = "python311-tox-wheel-1.0.0-1.5.noarch.rpm"
RPM_HASH = "ffa6269772704a6c6c68e6339da318c1d192b559cb7945acdaf3ea3a6b927fe5ad850b07e32f978d7914df812a3faef393b18fe0080e3a29b4a8d4628e9a0093"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tox-wheel \
python3.11dist-tox-wheel \
python311-tox-wheel \
python3dist-tox-wheel"

RDEPENDS:${PN} += "python-abi \
python311-tox \
python311-wheel"

inherit rpm
