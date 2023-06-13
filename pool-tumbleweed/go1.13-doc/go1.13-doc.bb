SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.13.15"

RPM_NAME = "go1.13-doc-1.13.15-2.15.aarch64.rpm"
RPM_HASH = "7db1d6a52e6ee75487a85d51255ced10bde17b836268549a6738abd53e1a8a4fb73d21477baeb29ef84ba3a519cb31e3e3cdfd1afe35c25629e17a2932418595"

RPROVIDES:${PN} += "go-doc \
go1.13-doc \
go1.13-doc(aarch-64)"

RDEPENDS:${PN} += "go1.13"

inherit rpm
