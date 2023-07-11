SUMMARY = "Testing system for smenu"
DESCRIPTION = "This packages contains some scripts and a number of tests to check the \
smenu tool."
LICENSE = "GPL-2.0-only"

PV = "1.2.0"

RPM_NAME = "smenu-tests-1.2.0-1.4.aarch64.rpm"
RPM_HASH = "c8a5bf3f8ab3ce40ba57093304cb3f357f23ae7f3e62e342612a0de466a66ee672ff3a3a058db312b48a0ca790872b6fbe71ce9d4bb46d19b22d3c140f2332d5"

RPROVIDES:${PN} += "smenu-tests"

RDEPENDS:${PN} += "smenu"

inherit rpm
