SUMMARY = "Documentation for poezio"
DESCRIPTION = "Documentation generated by the poezio package, but split out due to size."
LICENSE = "MIT"

PV = "0.14"

RPM_NAME = "poezio-doc-0.14-1.4.noarch.rpm"
RPM_HASH = "cd80c11208f3b0d2c9cfc53923b9d697b028aaf8830f236cc20c289726820c60cde93fe45215720a9f21a0f79fb59b3714ab075491cb5d003700ac426da4f6dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "poezio-doc"

RDEPENDS:${PN} += ""

inherit rpm
