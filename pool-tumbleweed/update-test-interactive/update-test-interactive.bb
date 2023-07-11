SUMMARY = "Test update that requires confirmation"
DESCRIPTION = "Package for testing the update stack during product development. \
 \
An update for this package should show a message to the user \
and wait for confirmation before proceeding. This is used, for \
example, in package updates that include proprietary licenses."
LICENSE = "GPL-2.0+"

PV = "5.1"

RPM_NAME = "update-test-interactive-5.1-1.18.aarch64.rpm"
RPM_HASH = "4f5a0571342b990ab390610190511f90230b4adf24ada682f47cf8bc534cf89331287fe48871fa3d96ce48d4c1eded38733eccfde8c831a7bef764693495950f"

RPROVIDES:${PN} += "update-test-interactive"

RDEPENDS:${PN} += ""

inherit rpm
