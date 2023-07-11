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

RPM_NAME = "python311-tablib-3.3.0-1.5.noarch.rpm"
RPM_HASH = "6a32aa59f7e51a937604e708652e00e913de2952981d19854e5118598529fb02c6374f740906746bd3bfac41aa58ad42ed309bb2310bc2b4280e1f0126a0cba8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tablib \
python3.11dist-tablib \
python311-tablib \
python3dist-tablib"

RDEPENDS:${PN} += "python-abi \
python311-MarkupPy \
python311-PyYAML \
python311-odfpy \
python311-openpyxl \
python311-tabulate \
python311-xlrd \
python311-xlwt"

inherit rpm
