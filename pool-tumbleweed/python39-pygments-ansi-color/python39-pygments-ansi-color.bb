SUMMARY = "ANSI color-code highlighting for Pygments"
DESCRIPTION = "An ANSI color-code highlighting lexer for Pygments."
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "python39-pygments-ansi-color-0.2.0-1.3.noarch.rpm"
RPM_HASH = "b198862981696cf1b318d2f79bb1a244307c3941209a121c881f87dd0aa11eb07388000b769c137af6fa6398eb1d255448113dbd7a1e2c177612d35fb19fefa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pygments-ansi-color \
python39-pygments-ansi-color \
python3dist-pygments-ansi-color"

RDEPENDS:${PN} += "python-abi \
python39-pygments \
python39-setuptools"

inherit rpm
