SUMMARY = "Swagger Schema validation"
DESCRIPTION = "Validation tooling for Swagger 2.0 specifications."
LICENSE = "MIT"

PV = "6.14.1"

RPM_NAME = "python39-flex-6.14.1-5.3.noarch.rpm"
RPM_HASH = "6f89b0a3974820db2e21e13408af14602b4d31e15774bbbb15fdc7075ba4e3dc1daa4e195d5f68570a906c8fa861aff32ca2e67ff03664fe0b27ad4fe30e3749"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flex \
python39-flex \
python3dist-flex"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyYAML \
python39-click \
python39-jsonpointer \
python39-requests \
python39-rfc3987 \
python39-six \
python39-strict-rfc3339 \
python39-validate-email \
update-alternatives"

inherit rpm
