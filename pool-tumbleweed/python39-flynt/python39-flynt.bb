SUMMARY = "CLI tool to convert a python project's  strings to f-strings"
DESCRIPTION = "CLI tool to convert a python project's  strings to f-strings."
LICENSE = "MIT"

PV = "0.76"

RPM_NAME = "python39-flynt-0.76-1.10.noarch.rpm"
RPM_HASH = "f04436d363b38d664a4b955a5df0a47bbf27a7cbbde372cd8a6ffaa248a9103e84c37a606ce2271a74122fc773230ce2e33041190195eab26fb48385e86afe4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flynt \
python39-flynt \
python3dist-flynt"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-astor \
python39-tomli"

inherit rpm
