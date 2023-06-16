SUMMARY = "Utilities for working with PO and POT files"
DESCRIPTION = "Dennis is a set of utilities for working with PO files. They \
translate POT files to find problems with localization in code, and \
lint PO files for common problems like variable formatting, \
mismatched HTML, missing variables, etc."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python311-dennis-1.1.0-1.4.noarch.rpm"
RPM_HASH = "ff3787f5c76d2fe39b7ddbd5939764aada389a1360d17ce4f5eedfcf83fa1b62e6cfccfbb1737f8d889a0eeb7affd9b087e0c81d0ae02c3af205070556f25e31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-dennis \
python311-dennis \
python3dist-dennis"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-click \
python311-polib \
update-alternatives"

inherit rpm
