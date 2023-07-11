SUMMARY = "Test update that includes security fixes"
DESCRIPTION = "Package for testing the update stack during product development. \
 \
An update for this package should have its category set to \
'security', indicating that one or more security vulnerabilities \
are being fixed."
LICENSE = "GPL-2.0+"

PV = "5.1"

RPM_NAME = "update-test-security-5.1-1.18.aarch64.rpm"
RPM_HASH = "420c6b717c8ed5797232b364eb660f25e8bac00a98ad2755b9ab86748e85b48fe8cb67625c994fdc59acf7c4fcc66138cf94136ff955a501bc38f635b16a2f02"

RPROVIDES:${PN} += "update-test-security"

RDEPENDS:${PN} += ""

inherit rpm
