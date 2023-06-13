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

RPM_NAME = "python39-tablib-3.3.0-1.3.noarch.rpm"
RPM_HASH = "173e33ef65e68e4120fc2889f8654b0949aae4f61fd4efef79565d073f366b3b279d4939f3d4aefb91843d9cd98988c7994a594aa1fef973e6814f499938dee4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(tablib) \
python39-tablib \
python3dist(tablib)"

RDEPENDS:${PN} += "python(abi) \
python39-MarkupPy \
python39-PyYAML \
python39-odfpy \
python39-openpyxl \
python39-tabulate \
python39-xlrd \
python39-xlwt"

inherit rpm
