SUMMARY = "Testsuite results"
DESCRIPTION = "Results from running the gcc and target library testsuites."
LICENSE = "SUSE-Public-Domain"

PV = "13.1.1+git7364"

RPM_NAME = "gcc13-testresults-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "cb17dec7fed522afa052c52be0e96f547874f7beef2fd12d648211e9bf078648c6f4d4d4619b8735a7268efbb86ea04e4ef6e56c0a8d030b0cedfc80167fdd8e"

RPROVIDES:${PN} += "gcc13-testresults \
gcc13-testresults(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
