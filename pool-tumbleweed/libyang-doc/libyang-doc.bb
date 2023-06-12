SUMMARY = "API documentation for libyang"
DESCRIPTION = "This is the API documentation of libyang."
LICENSE = "BSD-3-Clause"

PV = "2.1.55"

RPM_NAME = "libyang-doc-2.1.55-1.1.noarch.rpm"
RPM_HASH = "2de0edb25042390b8c617ab3940bf506059c4ba31805a80816678bfe6696898fc426cc52c4f058c72011470520034f292f4497afb1f8a1beae846d4a6defc2b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libyang-doc"
RDEPENDS:${PN} += ""

inherit rpm
