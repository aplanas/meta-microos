SUMMARY = "Testsuite results"
DESCRIPTION = "Results from running the gcc and target library testsuites."
LICENSE = "SUSE-Public-Domain"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-testresults-7.5.0+r278197-14.1.aarch64.rpm"
RPM_HASH = "833baed7bdea97220dcccaa3636fd78330ad9bff7c980a075a92e180bab50884ebf0d3d71a0a0d61b8e51060d9f6a027cdacc4de091aea49c7f37670e21fe282"

RPROVIDES:${PN} += "gcc7-testresults gcc7-testresults(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
