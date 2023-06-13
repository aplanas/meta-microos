SUMMARY = "Demos for saxon6"
DESCRIPTION = "Demonstrations and samples for saxon6."
LICENSE = "MPL-1.0"

PV = "6.5.5"

RPM_NAME = "saxon6-demo-6.5.5-16.6.noarch.rpm"
RPM_HASH = "2e862699cea33028ef45a0457c70910663feba88d73e3ae22783deec33ed104f6aba5429de5b381c25c8d3def74da20ee22ae38b4fc0925e524959bf5b08334e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon6-demo"

RDEPENDS:${PN} += "saxon6"

inherit rpm
