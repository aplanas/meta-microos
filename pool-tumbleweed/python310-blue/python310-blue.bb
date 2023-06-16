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

RPM_NAME = "python310-blue-0.9.1-2.1.noarch.rpm"
RPM_HASH = "0f0aebf46635976143485d5da4eddadf3adc891ccc7702342b9b7fa412cefe7b199422d5bbdb95f299f77c4501df322a80da1207ab08681a457e9a6a6ad71f88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-blue \
python3.10dist-blue \
python310-blue \
python3dist-blue"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-black \
python310-flake8 \
update-alternatives"

inherit rpm
