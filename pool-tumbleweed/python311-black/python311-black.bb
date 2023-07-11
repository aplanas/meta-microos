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

RPM_NAME = "python311-black-23.3.0-3.1.noarch.rpm"
RPM_HASH = "03cc9b94a117b91b39ac9db128023e1143a657b66721390a973f4d01d67a7250cb1fe3d068aa04b5975b45d1dc02547088b4c11013a887e475121d9c1280f6ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-black \
python3.11dist-black \
python311-black \
python3dist-black"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-aiohttp \
python311-aiohttp-cors \
python311-attrs \
python311-click \
python311-mypy-extensions \
python311-packaging \
python311-pathspec \
python311-platformdirs \
python311-tomli \
update-alternatives"

inherit rpm
