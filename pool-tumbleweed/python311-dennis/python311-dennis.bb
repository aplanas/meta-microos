SUMMARY = "Utilities for working with PO and POT files"
DESCRIPTION = "Dennis is a set of utilities for working with PO files. They \
translate POT files to find problems with localization in code, and \
lint PO files for common problems like variable formatting, \
mismatched HTML, missing variables, etc."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python311-dennis-1.1.0-1.6.noarch.rpm"
RPM_HASH = "34f679f9e9b8761bd1445c3c53e95a5c16b1db3a807dd4ab834bc82798983f0a7e1c659aaa1e32454b7e95ef17e869a2fd8596b08708d4485bbc29054b466e74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dennis \
python3.11dist-dennis \
python311-dennis \
python3dist-dennis"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-click \
python311-polib \
update-alternatives"

inherit rpm
