SUMMARY = "Parser tools for Mozilla's Glean telemetry"
DESCRIPTION = "Parser tools for Mozilla's Glean telemetry"
LICENSE = "MPL-2.0"

PV = "6.3.0"

RPM_NAME = "python310-glean-parser-6.3.0-1.6.noarch.rpm"
RPM_HASH = "46e55ae6414b3749ad6f8f33aa238a06ab591d2b355d741057b3d4940e5f4c3cc88d077e63a105f95c3495b5e64e41d9301019af9f8091cd6af6a6e7996287c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-glean-parser \
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
