SUMMARY = "Pure python package for reading/writing dBase, FoxPro, and Visual FoxPro .dbf"
DESCRIPTION = "Pure python package for reading/writing dBase, FoxPro, and Visual FoxPro .dbf \
files (including memos) \
 \
Currently supports dBase III, Clipper, FoxPro, and Visual FoxPro tables. Text is \
returned as unicode, and codepage settings in tables are honored. Memos and Null \
fields are supported."
LICENSE = "BSD-3-Clause"

PV = "0.99.3"

RPM_NAME = "python310-dbf-0.99.3-1.5.noarch.rpm"
RPM_HASH = "9dbf84c6a26cc7340cf93f0346187ef3902e1e54871d6bbbc40b71177fc061c3367190d025048d5f2207ea7bfaba3f827664104f9d08d3acb796cf7cf29f77fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dbf \
python310-dbf \
python3dist-dbf"

RDEPENDS:${PN} += "python-abi \
python310-aenum \
python310-pytz"

inherit rpm
