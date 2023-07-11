SUMMARY = "Format agnostic tabular data library (XLS, JSON, YAML, CSV)"
DESCRIPTION = "Tablib is a format-agnostic tabular dataset library, written in Python. \
 \
Output formats supported: \
 \
- Excel (Sets + Books) \
- JSON (Sets + Books) \
- YAML (Sets + Books) \
- HTML (Sets) \
- TSV (Sets) \
- CSV (Sets)"
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python39-tablib-3.3.0-1.5.noarch.rpm"
RPM_HASH = "1df0889aab4040b762b401746766b00d1b1225f191135c59a07f1528f014e8e4c92679124c19b7fd977626e6ac1d6e7dca0200b7177218766963d3180dc2659a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tablib \
python39-tablib \
python3dist-tablib"

RDEPENDS:${PN} += "python-abi \
python39-MarkupPy \
python39-PyYAML \
python39-odfpy \
python39-openpyxl \
python39-tabulate \
python39-xlrd \
python39-xlwt"

inherit rpm
