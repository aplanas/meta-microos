SUMMARY = "Module to identify specific nodes in a JSON document"
DESCRIPTION = "A module to identify specific nodes in a JSON document (according to draft 08)."
LICENSE = "BSD-3-Clause"

PV = "2.3"

RPM_NAME = "python311-jsonpointer-2.3-2.2.noarch.rpm"
RPM_HASH = "de510287107a0fba012328cf8c29242a383c810377866438881c3f7326e210677c2f59639aaca1ea65e166d8898bcc7680eae8ba4311403020f424ebb78787fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonpointer \
python3.11dist-jsonpointer \
python311-jsonpointer \
python3dist-jsonpointer"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
