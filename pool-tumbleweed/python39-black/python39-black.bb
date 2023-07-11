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

PV = "23.3.0"

RPM_NAME = "python39-black-23.3.0-3.1.noarch.rpm"
RPM_HASH = "3b2693d270e30e9ce658f615da8c9e569afce4fa9ee1b747b0b346278e2d47b1cc870470cae1b67497aa6e1a8d68fe7bb517652c8a98e0a2c742e5e23462ac5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-black \
python39-black \
python3dist-black"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-aiohttp \
python39-aiohttp-cors \
python39-attrs \
python39-click \
python39-mypy-extensions \
python39-packaging \
python39-pathspec \
python39-platformdirs \
python39-tomli \
python39-typing-extensions \
update-alternatives"

inherit rpm
