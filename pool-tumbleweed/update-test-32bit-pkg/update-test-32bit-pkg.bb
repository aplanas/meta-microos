SUMMARY = "Test update that contains a 32bit package"
DESCRIPTION = "Package for testing the update stack during product development. \
 \
An update for this package should contain a 32bit-package."
LICENSE = "GPL-2.0+"

PV = "5.1"

RPM_NAME = "update-test-32bit-pkg-5.1-1.17.aarch64.rpm"
RPM_HASH = "a3ccbc92732bbb79c194c2d67dd9a3bcaa1f88aa0176fbf7463deb7fdcc926d196236b7b8bf68a373e32fb17c465bad147fe61a588b8f60a55d63bcadbb09ea2"

RPROVIDES:${PN} += "update-test-32bit-pkg \
update-test-32bit-pkg(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
