SUMMARY = "Testsuite results"
DESCRIPTION = "Results from running the gcc and target library testsuites."
LICENSE = "SUSE-Public-Domain"

PV = "13.2.1+git7683"

RPM_NAME = "gcc13-testresults-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "2be93d33c89a437160233e8b793b922db8a766c761cffcabb515b8bfc0ac5555aa1c53dca4aff2adebaa806c6ef5ac42b7700e4f1064eda6437f8ab17f503cbf"

RPROVIDES:${PN} += "gcc13-testresults"

RDEPENDS:${PN} += ""

inherit rpm
