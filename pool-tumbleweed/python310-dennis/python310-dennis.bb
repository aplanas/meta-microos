SUMMARY = "Utilities for working with PO and POT files"
DESCRIPTION = "Dennis is a set of utilities for working with PO files. They \
translate POT files to find problems with localization in code, and \
lint PO files for common problems like variable formatting, \
mismatched HTML, missing variables, etc."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python310-dennis-1.1.0-1.4.noarch.rpm"
RPM_HASH = "7b60c09e5d78bc11ad8ace206b646de129f0ee861752bd286b186f1a21bf931266eec991a290bbd427518ccf84748dd0d0573789836db1b7e94eb1f7206300e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dennis \
python3.10dist(dennis) \
python310-dennis \
python3dist(dennis)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-click \
python310-polib \
update-alternatives"

inherit rpm
