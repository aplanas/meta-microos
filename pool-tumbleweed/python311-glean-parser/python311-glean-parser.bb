SUMMARY = "Parser tools for Mozilla's Glean telemetry"
DESCRIPTION = "Parser tools for Mozilla's Glean telemetry"
LICENSE = "MPL-2.0"

PV = "6.3.0"

RPM_NAME = "python311-glean-parser-6.3.0-1.6.noarch.rpm"
RPM_HASH = "de12c3014e3f12255a17be0a841d44da2341721a7cffe9653864e42dacac68ecc4014f8710e02e1cb5cd5084774893d6834819ba5276d753cf4e3d7b41e87490"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-glean-parser \
python3.11dist-glean-parser \
python311-glean-parser \
python3dist-glean-parser"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Jinja2 \
python311-MarkupSafe \
python311-PyYAML \
python311-appdirs \
python311-click \
python311-diskcache \
python311-jsonschema \
python311-yamllint \
update-alternatives"

inherit rpm
