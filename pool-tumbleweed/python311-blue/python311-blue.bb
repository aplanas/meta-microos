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

RPM_NAME = "python311-blue-0.9.1-2.3.noarch.rpm"
RPM_HASH = "81e4acc98a76c6eac4648625d4ba06e7f0ec171324afca697f5b24cf1ff4175421d5e386cee4c01890db8eb5ed51a38c1ee708f54ecaf46f8e55b385d928cb05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-blue \
python3.11dist-blue \
python311-blue \
python3dist-blue"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-black \
python311-flake8 \
update-alternatives"

inherit rpm
