SUMMARY = "A Tox plugin that builds and installs wheels instead of sdist"
DESCRIPTION = "A Tox plugin that builds and installs wheels instead of sdist."
LICENSE = "BSD-2-Clause"

PV = "1.0.0"

RPM_NAME = "python39-tox-wheel-1.0.0-1.3.noarch.rpm"
RPM_HASH = "c4e2e01bb68bf1a5fe6b10c88b82a1cca9a81070d7a77cd7ee0c49bad88b78e155a7caf92f6e1d49fdbaeb8297d4c2895a013f08f05890a2e6950ac7daeb3ebf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tox-wheel \
python39-tox-wheel \
python3dist-tox-wheel"

RDEPENDS:${PN} += "python-abi \
python39-tox \
python39-wheel"

inherit rpm
