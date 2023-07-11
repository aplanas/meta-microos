SUMMARY = "Config file parsing and option management"
DESCRIPTION = "Config file parsing and option management."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python311-confpy-0.11.0-1.14.noarch.rpm"
RPM_HASH = "0190ad793dada974548cff655c09bfce8fb094458de7026ee76d5c84139a2f15a3411fdcfa5015bffc22ca7ae23f9381bbf12a281f915c2d439b8dcf54533f77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-confpy \
python3.11dist-confpy \
python311-confpy \
python3dist-confpy"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi"

inherit rpm
