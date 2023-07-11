SUMMARY = "Utilities for working with PO and POT files"
DESCRIPTION = "Dennis is a set of utilities for working with PO files. They \
translate POT files to find problems with localization in code, and \
lint PO files for common problems like variable formatting, \
mismatched HTML, missing variables, etc."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python39-dennis-1.1.0-1.6.noarch.rpm"
RPM_HASH = "732f4d9ccf87d5647ecfd611616272e342036daf200ccee3cdf17d77de6cb62ad89a2e110d8857cffcb7a810b47a3ca1c48c03571be8c96502f7191807b65f7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dennis \
python39-dennis \
python3dist-dennis"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-click \
python39-polib \
update-alternatives"

inherit rpm
