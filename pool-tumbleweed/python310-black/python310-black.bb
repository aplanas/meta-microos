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

RPM_NAME = "python310-black-23.3.0-2.1.noarch.rpm"
RPM_HASH = "6f9078e48899e2b021de55f37fd20a88d11c8853ba22bd5bb365b8f1b6057d8f9122cd120a97d02b516c369cacbe81b6077538c5db3c3787f5baf5bc9c24dac1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-black \
python3.10dist(black) \
python310-black \
python3dist(black)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-aiohttp \
python310-aiohttp_cors \
python310-attrs \
python310-click \
python310-mypy_extensions \
python310-packaging \
python310-pathspec \
python310-platformdirs \
python310-tomli \
update-alternatives"

inherit rpm
