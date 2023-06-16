SUMMARY = "A code formatter written in, and written for Python"
DESCRIPTION = "Black is a code formatter written in Python, and reformats Python 2.x \
and 3.x code. \
 \
Black reformats entire files in place. It is not configurable. It \
does not take previous formatting into account. The coding style \
enforced is a PEP-8 subset, adheres to PEP-257, and otherwise passes \
the rules of the 'pycodestyle' checker. Black skips over blocks that \
start and end with '# fmt: off' and '# fmt: on', respectively. It \
also recognizes YAPF's block comments to the same effect."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python39-blue-0.9.1-2.1.noarch.rpm"
RPM_HASH = "92fc60b16d8e63721bdc491978433e3470099c8084d514ab5f12ff6b1b8718be3e0c256f8342bc5e6ed4e246dc28e2cf7ee1b639059d967a4c46193d58087bc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-blue \
python39-blue \
python3dist-blue"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-black \
python39-flake8 \
update-alternatives"

inherit rpm
