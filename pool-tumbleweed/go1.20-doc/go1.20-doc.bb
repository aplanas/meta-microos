SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.20.8"

RPM_NAME = "go1.20-doc-1.20.8-1.1.aarch64.rpm"
RPM_HASH = "29a237a3c4c601809fbfa6c8192567c89f242c5732e07cb045e8d0e38d68ae9e9a353b49447bc44c2e6c84f2a3c398f1faf36008306f8ca39bd2c5a791abd0f8"

RPROVIDES:${PN} += "go-doc \
go1.20-doc"

RDEPENDS:${PN} += ""

inherit rpm
