SUMMARY = "Passive checker of Python programs"
DESCRIPTION = "Pyflakes is program to analyze Python programs and detect various errors. It \
works by parsing the source file, not importing it, so it is safe to use on \
modules with side effects. It's also much faster."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python311-pyflakes-3.1.0-1.1.noarch.rpm"
RPM_HASH = "f4173b84ddfcf86e76dfa90e93b08c6af8c452ac582bb6ebd9431f4c655dbc45880fb3d511b8e92b9ed16ebf60ebf7e4ac6f5ead132b098a9bc893774a7c934a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyflakes \
python3.11dist-pyflakes \
python311-pyflakes \
python3dist-pyflakes"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
