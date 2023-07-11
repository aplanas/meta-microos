SUMMARY = "Pure python package for reading/writing dBase, FoxPro, and Visual FoxPro .dbf"
DESCRIPTION = "Pure python package for reading/writing dBase, FoxPro, and Visual FoxPro .dbf \
files (including memos) \
 \
Currently supports dBase III, Clipper, FoxPro, and Visual FoxPro tables. Text is \
returned as unicode, and codepage settings in tables are honored. Memos and Null \
fields are supported."
LICENSE = "BSD-3-Clause"

PV = "0.99.3"

RPM_NAME = "python311-dbf-0.99.3-1.5.noarch.rpm"
RPM_HASH = "66d5a01bacbf6e2a1c3b9a01ea1b72769d57033926d66fd1ada9c816d842324d6a281031b6716dae157cdfaecf762a74cb94a50bcbc9587a19e54f8571d5298e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dbf \
python3.11dist-dbf \
python311-dbf \
python3dist-dbf"

RDEPENDS:${PN} += "python-abi \
python311-aenum \
python311-pytz"

inherit rpm
