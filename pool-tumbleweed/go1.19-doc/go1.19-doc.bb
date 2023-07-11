SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.19.10"

RPM_NAME = "go1.19-doc-1.19.10-1.1.aarch64.rpm"
RPM_HASH = "dfe5fc60ded46f52ebfb611fcf36c7f2ffcb6b7b1f00b3b80e5fc702b98f62a70f2ccf59a04daffd394ff9bc9e878c546f7e679735957c381de4a7a5628340dc"

RPROVIDES:${PN} += "go-doc \
go1.19-doc"

RDEPENDS:${PN} += ""

inherit rpm
