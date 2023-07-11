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

RPM_NAME = "python310-tablib-3.3.0-1.5.noarch.rpm"
RPM_HASH = "1ca1d561610952dd63907fdb5456a8ba92e0dd57fe140f9e2f5ed3daef11b1d80cdd937994953a03bbabc3d41a12f3055735e2ea6d3d7d70b66aab761896352c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tablib \
python310-tablib \
python3dist-tablib"

RDEPENDS:${PN} += "python-abi \
python310-MarkupPy \
python310-PyYAML \
python310-odfpy \
python310-openpyxl \
python310-tabulate \
python310-xlrd \
python310-xlwt"

inherit rpm
