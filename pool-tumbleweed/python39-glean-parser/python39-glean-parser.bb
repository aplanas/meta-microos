SUMMARY = "Parser tools for Mozilla's Glean telemetry"
DESCRIPTION = "Parser tools for Mozilla's Glean telemetry"
LICENSE = "MPL-2.0"

PV = "6.3.0"

RPM_NAME = "python39-glean-parser-6.3.0-1.4.noarch.rpm"
RPM_HASH = "8321c40532a98bcc4ccc9f7fa1d09ee5923f301f66654ef5556c2fb50f175038979db8a548b36fb84aee848642e50dca12c040328e4c4f73f4861111c4a018ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(glean-parser) \
python39-glean-parser \
python3dist(glean-parser)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
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
