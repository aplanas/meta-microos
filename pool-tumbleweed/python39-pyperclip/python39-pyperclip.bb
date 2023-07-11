SUMMARY = "A clipboard module for Python"
DESCRIPTION = "A clipboard module for Python. It only handles plain text."
LICENSE = "BSD-3-Clause"

PV = "1.8.2"

RPM_NAME = "python39-pyperclip-1.8.2-2.3.noarch.rpm"
RPM_HASH = "ac9eaba4a5e6e1735ba57f41c4cfefe994d3dddaadc94c72f40caeb048e28f1e2d5e95aa5ec002bddebcd3ba8f102838e28ac2bef18f091a1728ead5c7b96d32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyperclip \
python39-pyperclip \
python3dist-pyperclip"

RDEPENDS:${PN} += "python-abi \
xclip \
xsel"

inherit rpm
