SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.20.6"

RPM_NAME = "go1.20-doc-1.20.6-1.1.aarch64.rpm"
RPM_HASH = "98974ccd5331c80080a219196c511439b2ad8fa24bb9c0ec14481c19f1bc318e1ce9e9ff9f31e5d5626b8321bf1cc0997be5d550d78b966a1bd40a4ba0d6ee73"

RPROVIDES:${PN} += "go-doc \
go1.20-doc"

RDEPENDS:${PN} += ""

inherit rpm
