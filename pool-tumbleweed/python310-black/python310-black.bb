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

RPM_NAME = "python310-black-23.7.0-1.1.noarch.rpm"
RPM_HASH = "6759a7fad7868faecbcbb09ed3073ea8d144f3fbb8058254ffb8cba1a4409b27a66095bb42f43fa1a6e10414ed3081941c095e59bf6c461965dcf515a4191045"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-black \
python310-black \
python3dist-black"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-aiohttp \
python310-aiohttp-cors \
python310-attrs \
python310-click \
python310-mypy-extensions \
python310-packaging \
python310-pathspec \
python310-platformdirs \
python310-tomli \
update-alternatives"

inherit rpm
