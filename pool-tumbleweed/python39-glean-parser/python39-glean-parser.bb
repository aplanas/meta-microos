SUMMARY = "Parser tools for Mozilla's Glean telemetry"
DESCRIPTION = "Parser tools for Mozilla's Glean telemetry"
LICENSE = "MPL-2.0"

PV = "6.3.0"

RPM_NAME = "python39-glean-parser-6.3.0-1.6.noarch.rpm"
RPM_HASH = "520a0915488a8d6f563f3c7fcda61ce3248689756aa96f5398adfa87b1fe6247819275b23189c7c9d0c53d5136df778f1866b06e61941cb455cb78067c6f512f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-glean-parser \
python39-glean-parser \
python3dist-glean-parser"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Jinja2 \
python39-MarkupSafe \
python39-PyYAML \
python39-appdirs \
python39-click \
python39-diskcache \
python39-jsonschema \
python39-yamllint \
update-alternatives"

inherit rpm
