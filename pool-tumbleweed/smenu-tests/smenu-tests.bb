SUMMARY = "Testing system for smenu"
DESCRIPTION = "This packages contains some scripts and a number of tests to check the \
smenu tool."
LICENSE = "GPL-2.0-only"

PV = "1.3.0"

RPM_NAME = "smenu-tests-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "04b5d8c3bf995e06163f40810fe597e4b80b84c55d177ab1aa5e02cb85ef5887c6b4541c89e31c4535bafd521bedc6a95c0e34b558688671ba2ab339c54ceb18"

RPROVIDES:${PN} += "smenu-tests"

RDEPENDS:${PN} += "smenu"

inherit rpm
