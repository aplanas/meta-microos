SUMMARY = "A Tox plugin that builds and installs wheels instead of sdist"
DESCRIPTION = "A Tox plugin that builds and installs wheels instead of sdist."
LICENSE = "BSD-2-Clause"

PV = "1.0.0"

RPM_NAME = "python311-tox-wheel-1.0.0-1.3.noarch.rpm"
RPM_HASH = "eb7027b9b0c621bb16e1eb35440eab5edc9741a494c975a61f13b3bdeaa274667716fd0f035acefca8afb3b79d94fbf348721c8a601a47a4262432dfeb5cae25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-tox-wheel \
python311-tox-wheel \
python3dist-tox-wheel"

RDEPENDS:${PN} += "python-abi \
python311-tox \
python311-wheel"

inherit rpm
