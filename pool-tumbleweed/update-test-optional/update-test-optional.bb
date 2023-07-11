SUMMARY = "Test update that is not mandatory"
DESCRIPTION = "Package for testing the update stack during product development. \
 \
An update for this package should have its category set to \
'optional'. The software stack should not select such updates \
for installation by default. This is used, for example, to add \
new packages to a product."
LICENSE = "GPL-2.0+"

PV = "5.1"

RPM_NAME = "update-test-optional-5.1-1.18.aarch64.rpm"
RPM_HASH = "d56e5c8fd168f536672032e4758a80d44f8e9706f9a8bb2b5c47ed0b74b0a11661bcf75346b5bd4501d63f8cf55e5775f594160f86a93cb2dbf5282a50d9c2c1"

RPROVIDES:${PN} += "update-test-optional"

RDEPENDS:${PN} += ""

inherit rpm
