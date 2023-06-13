SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.16.15"

RPM_NAME = "go1.16-doc-1.16.15-6.1.aarch64.rpm"
RPM_HASH = "816964556682529e818074dbeece89612fcd6d316a95c98af11facf6433c2bd500cc997cde088220c9cbbdc04a38661c1f6e474ff9c72ef59cb98fccc6ee8727"

RPROVIDES:${PN} += "go-doc \
go1.16-doc \
go1.16-doc(aarch-64)"

RDEPENDS:${PN} += "go1.16"

inherit rpm
