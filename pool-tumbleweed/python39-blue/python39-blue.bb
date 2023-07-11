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

RPM_NAME = "python39-blue-0.9.1-2.3.noarch.rpm"
RPM_HASH = "bdb309bcfc1228970bdefc4ea5d48de8c721d953491533e8c146d1bff34b278dd27aea2b94ee3528a6aa7d86bd76a22ad6e73e08c7217d660d9da508d134bc02"
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
