SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.21.1"

RPM_NAME = "go1.21-doc-1.21.1-1.1.aarch64.rpm"
RPM_HASH = "dad2f9be0e32a1c602dba27a9b00d4fd2714079856c4a57a0871049bb84109dd646c14763763e9e00f496156ddf2278e894a29489e4ddc56d29e40edbf0af96f"

RPROVIDES:${PN} += "go-doc \
go1.21-doc"

RDEPENDS:${PN} += ""

inherit rpm
