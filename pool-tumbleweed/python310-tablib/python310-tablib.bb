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

RPM_NAME = "python310-tablib-3.3.0-1.3.noarch.rpm"
RPM_HASH = "64c8236465fcd51e7444664216e97a04b50df8fa82001e4098c0b363c0c5e00823d555b338f0340f0032987f576476a4f53ba4a2bbcf8f148429a8f7b7d6e5ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tablib \
python3.10dist(tablib) \
python310-tablib \
python3dist(tablib)"

RDEPENDS:${PN} += "python(abi) \
python310-MarkupPy \
python310-PyYAML \
python310-odfpy \
python310-openpyxl \
python310-tabulate \
python310-xlrd \
python310-xlwt"

inherit rpm
