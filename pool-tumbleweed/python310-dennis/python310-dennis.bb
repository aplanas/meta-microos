SUMMARY = "Utilities for working with PO and POT files"
DESCRIPTION = "Dennis is a set of utilities for working with PO files. They \
translate POT files to find problems with localization in code, and \
lint PO files for common problems like variable formatting, \
mismatched HTML, missing variables, etc."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python310-dennis-1.1.0-1.6.noarch.rpm"
RPM_HASH = "594ad43fdf0354b7860de12cfeb09525e0bfb20bfa1f42271966f6e314c9416702f9006fdd96c6caf45a37f9b289e7ed6498f4a5328c9d59d189ffa4bd11072f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dennis \
python310-dennis \
python3dist-dennis"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-click \
python310-polib \
update-alternatives"

inherit rpm
