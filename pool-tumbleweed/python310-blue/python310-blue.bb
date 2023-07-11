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

RPM_NAME = "python310-blue-0.9.1-2.3.noarch.rpm"
RPM_HASH = "15f66ebf77ce86505b829c7caccb9c02e69fa76dc79c74516de9c66386b91214987882199bdc3ce8d7bfa3a1aeaf7016d99d9b5bd9b26b7fbab6bac910894f08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-blue \
python310-blue \
python3dist-blue"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-black \
python310-flake8 \
update-alternatives"

inherit rpm
