SUMMARY = "Test update that includes new features"
DESCRIPTION = "Package for testing the update stack during product development. \
 \
An update for this package should have its category set to \
'feature', indicating that it includes a new feature and not \
only fixes."
LICENSE = "GPL-2.0+"

PV = "5.1"

RPM_NAME = "update-test-feature-5.1-1.18.aarch64.rpm"
RPM_HASH = "f0fcfe747cfb5d28098198fb2908332374fe6b874ea601182becf4e1cf0ffd625f30cbd55bb32f0b9a4b0a58ccb4d1be9dc5a9c58dcbb439f17f2c126e745665"

RPROVIDES:${PN} += "update-test-feature"

RDEPENDS:${PN} += ""

inherit rpm
