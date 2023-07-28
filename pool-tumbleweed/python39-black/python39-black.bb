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

PV = "23.7.0"

RPM_NAME = "python39-black-23.7.0-1.1.noarch.rpm"
RPM_HASH = "5fc1bfb8ee20401208af3e505ff95ff321fd7f3de3e35a2b67bb2fe5baedc4329b35db96057beb86a48660d490db7349732b22d34e8b5573b37a6ebc8b72b737"
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
