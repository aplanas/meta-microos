SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.21"

RPM_NAME = "go-doc-1.21-1.1.aarch64.rpm"
RPM_HASH = "3d22a6e3417406468e96c087bacdeeb10fd44017c5a5064c5675a1ba3ab6e754eb5d8f651aa9953ef6e07500e7a24808245510a50fc81ae5f048ea8b0138c991"

RPROVIDES:${PN} += "go-doc \
golang-docs"

RDEPENDS:${PN} += "go \
go1.21-doc"

inherit rpm
