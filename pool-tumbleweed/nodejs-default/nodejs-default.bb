SUMMARY = "Default version of nodejs"
DESCRIPTION = "Depends on the most current and recommended version of nodejs for \
the current architecture and codestream."
LICENSE = "MIT"

PV = "5.1"

RPM_NAME = "nodejs-default-5.1-2.1.aarch64.rpm"
RPM_HASH = "987f9da9b4d7f9899f99b08a3b8943f7688c8177ab932b55fa5420ad512f44aa8616363704faa331ed3daface80c59d848a54394422fb76514ce8b31b1ff8f01"

RPROVIDES:${PN} += "nodejs \
nodejs-default \
nodejs-engine"

RDEPENDS:${PN} += "nodejs-common \
nodejs20"

inherit rpm
