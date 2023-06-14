SUMMARY = "Parser tools for Mozilla's Glean telemetry"
DESCRIPTION = "Parser tools for Mozilla's Glean telemetry"
LICENSE = "MPL-2.0"

PV = "6.3.0"

RPM_NAME = "python311-glean-parser-6.3.0-1.4.noarch.rpm"
RPM_HASH = "857764a7db8f6964c6309598aea7d52591a029769fc4fe4a767579a9575ed877761719531282970f426c5dd9b0afd0468c92bf8fd6a60a2c8471a37a71de0073"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-glean-parser \
python311-glean-parser \
python3dist-glean-parser"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
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
