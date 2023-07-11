SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.20.5"

RPM_NAME = "go1.20-doc-1.20.5-1.1.aarch64.rpm"
RPM_HASH = "ef96c122e22150f12c85469b0a492a8773156dcf51d00be4c9d6d93aa2dee36af353177d5a9aa32ae7de4f3ae7b79175654fb30c35b23e3a09bdef32dd03bdb8"

RPROVIDES:${PN} += "go-doc \
go1.20-doc"

RDEPENDS:${PN} += ""

inherit rpm
