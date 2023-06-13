SUMMARY = "A template engine written in pure Python"
DESCRIPTION = "Jinja2 is a template engine written in pure Python.  It provides a Django \
inspired non-XML syntax but supports inline expressions and an optional \
sandboxed environment."
LICENSE = "BSD-3-Clause"

PV = "3.1.2"

RPM_NAME = "python39-Jinja2-3.1.2-3.1.aarch64.rpm"
RPM_HASH = "1bd226c9637d62c26662f5096c0e8a3f9a07d6e625790f4ed7b85be7923d9d2ce8dbc480ae6e1f01ba7fdc74731f2324c2f1db733f8c682488e44d5f8598d197"

RPROVIDES:${PN} += "python3.9dist(jinja2) \
python39-Jinja2 \
python39-Jinja2(aarch-64) \
python39-jinja2 \
python3dist(jinja2)"

RDEPENDS:${PN} += "python(abi) \
python39-MarkupSafe"

inherit rpm
