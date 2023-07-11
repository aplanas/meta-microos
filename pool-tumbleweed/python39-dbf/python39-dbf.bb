SUMMARY = "Pure python package for reading/writing dBase, FoxPro, and Visual FoxPro .dbf"
DESCRIPTION = "Pure python package for reading/writing dBase, FoxPro, and Visual FoxPro .dbf \
files (including memos) \
 \
Currently supports dBase III, Clipper, FoxPro, and Visual FoxPro tables. Text is \
returned as unicode, and codepage settings in tables are honored. Memos and Null \
fields are supported."
LICENSE = "BSD-3-Clause"

PV = "0.99.3"

RPM_NAME = "python39-dbf-0.99.3-1.5.noarch.rpm"
RPM_HASH = "11f3a374b2ae7a5a274d69e33ef7ffc8b5ee0a6f6ef26cca9485399b587ea9821899612b81b28a6dde6e8bd144a9e336b160895040cf45f37347ea14c0ddbf85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dbf \
python39-dbf \
python3dist-dbf"

RDEPENDS:${PN} += "python-abi \
python39-aenum \
python39-pytz"

inherit rpm
