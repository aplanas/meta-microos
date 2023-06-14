SUMMARY = "Pure python package for reading/writing dBase, FoxPro, and Visual FoxPro .dbf"
DESCRIPTION = "Pure python package for reading/writing dBase, FoxPro, and Visual FoxPro .dbf \
files (including memos) \
 \
Currently supports dBase III, Clipper, FoxPro, and Visual FoxPro tables. Text is \
returned as unicode, and codepage settings in tables are honored. Memos and Null \
fields are supported."
LICENSE = "BSD-3-Clause"

PV = "0.99.3"

RPM_NAME = "python311-dbf-0.99.3-1.3.noarch.rpm"
RPM_HASH = "a8b4a77ac45058561d839efb4fd1372add99659c7d363a24c2ccf99cb5b4f955f77be4dba123b3a63e8795bf1e8285937479e95cd8d85735f81d8fc5a6411fa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-dbf \
python311-dbf \
python3dist-dbf"

RDEPENDS:${PN} += "python-abi \
python311-aenum \
python311-pytz"

inherit rpm
