SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.9.7"

RPM_NAME = "go1.9-doc-1.9.7-12.11.aarch64.rpm"
RPM_HASH = "9fe188b63109e8629b53f20e971fbd02e5549b1a2bbc18212f8d05859da2eb0b403abd74c0bbf2eed544d965ed2b13785744f058e1cda761badf7732d24de6e5"

RPROVIDES:${PN} += "go-doc \
go1.9-doc"

RDEPENDS:${PN} += "go1.9"

inherit rpm
