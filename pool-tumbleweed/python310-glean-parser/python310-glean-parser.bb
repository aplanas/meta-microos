SUMMARY = "Parser tools for Mozilla's Glean telemetry"
DESCRIPTION = "Parser tools for Mozilla's Glean telemetry"
LICENSE = "MPL-2.0"

PV = "6.3.0"

RPM_NAME = "python310-glean-parser-6.3.0-1.4.noarch.rpm"
RPM_HASH = "549ef11c25601c3cd092f2a7012a2f49eb061db38bfda04fd72a0bbc8979d247fc79a5f151926afe9f09e72d513ac6d7cc9bad063e10fc2596502536ceb6d58a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-glean-parser \
python3.10dist-glean-parser \
python310-glean-parser \
python3dist-glean-parser"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Jinja2 \
python310-MarkupSafe \
python310-PyYAML \
python310-appdirs \
python310-click \
python310-diskcache \
python310-jsonschema \
python310-yamllint \
update-alternatives"

inherit rpm
