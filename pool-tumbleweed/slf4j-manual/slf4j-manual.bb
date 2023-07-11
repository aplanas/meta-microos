SUMMARY = "Documents for slf4j"
DESCRIPTION = "Manual for slf4j."
LICENSE = "Apache-2.0 & MIT"

PV = "1.7.36"

RPM_NAME = "slf4j-manual-1.7.36-4.2.noarch.rpm"
RPM_HASH = "de455bd568977697f0ecd708e985a57ee6f85529af3abeb547aa5b84bfadb7046355a9c48534f5bcf40fa9dee0305e03341a0b74e123636f39bdfdc379aa77fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "slf4j-manual"

RDEPENDS:${PN} += ""

inherit rpm
