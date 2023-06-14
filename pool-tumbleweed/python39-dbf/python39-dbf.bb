SUMMARY = "Pure python package for reading/writing dBase, FoxPro, and Visual FoxPro .dbf"
DESCRIPTION = "Pure python package for reading/writing dBase, FoxPro, and Visual FoxPro .dbf \
files (including memos) \
 \
Currently supports dBase III, Clipper, FoxPro, and Visual FoxPro tables. Text is \
returned as unicode, and codepage settings in tables are honored. Memos and Null \
fields are supported."
LICENSE = "BSD-3-Clause"

PV = "0.99.3"

RPM_NAME = "python39-dbf-0.99.3-1.3.noarch.rpm"
RPM_HASH = "75cde3f04660c20c5fe98d2a00399fd05af4ce8bf709264039176bdd087cf250dcac12612853641f4fa7b236342e87f532fea65db7d6309f0e1bcab8ece42cc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dbf \
python39-dbf \
python3dist-dbf"

RDEPENDS:${PN} += "python-abi \
python39-aenum \
python39-pytz"

inherit rpm
