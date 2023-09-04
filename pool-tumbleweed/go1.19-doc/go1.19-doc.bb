SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.19.12"

RPM_NAME = "go1.19-doc-1.19.12-1.1.aarch64.rpm"
RPM_HASH = "63ebee8790fb1cbb974108c5476e9252d0911b9181b0d459e7976468a4193edc9c3693cc12b77bad71c69c91115fdafc812591c884e9ee8d0dea4a14a55b7eec"

RPROVIDES:${PN} += "go-doc \
go1.19-doc"

RDEPENDS:${PN} += ""

inherit rpm
