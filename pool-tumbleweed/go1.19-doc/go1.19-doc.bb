SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.19.13"

RPM_NAME = "go1.19-doc-1.19.13-1.1.aarch64.rpm"
RPM_HASH = "70987fee1a2e17be2d4037633d789d20746123b888d396b31afb8082153f7cbf5e8d4104cb2104e69cbf329061e3df08f29203aa528e072098a92a25ebe75def"

RPROVIDES:${PN} += "go-doc \
go1.19-doc"

RDEPENDS:${PN} += ""

inherit rpm
