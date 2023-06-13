SUMMARY = "Test update that requires confirmation"
DESCRIPTION = "Package for testing the update stack during product development. \
 \
An update for this package should show a message to the user \
and wait for confirmation before proceeding. This is used, for \
example, in package updates that include proprietary licenses."
LICENSE = "GPL-2.0+"

PV = "5.1"

RPM_NAME = "update-test-interactive-5.1-1.17.aarch64.rpm"
RPM_HASH = "22175ccd636366f971fc678844815e9f358d90209e126b57826d16e19f4be35de5bf93c67e39c0fa3d8377404a9e169a14b4ad161bde26c53db4ed3e1380bb80"

RPROVIDES:${PN} += "update-test-interactive \
update-test-interactive(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
