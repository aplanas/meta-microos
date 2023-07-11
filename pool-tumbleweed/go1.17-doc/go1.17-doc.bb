SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.17.13"

RPM_NAME = "go1.17-doc-1.17.13-5.2.aarch64.rpm"
RPM_HASH = "147aead3470e46caf583bf4f65827ca2792ab99b1cccf29ec54067e2e5a57c7f027b1888aec0f31570695ef5451f1b9fdcc4a3b9866348d48b635f17c142c317"

RPROVIDES:${PN} += "go-doc \
go1.17-doc"

RDEPENDS:${PN} += ""

inherit rpm
