SUMMARY = "Virtual Organization Membership Service Documentation"
DESCRIPTION = "Documentation for the Virtual Organization Membership Service APIs."
LICENSE = "Apache-2.0"

PV = "2.1.0~rc3"

RPM_NAME = "voms-doc-2.1.0~rc3-1.3.noarch.rpm"
RPM_HASH = "289272ad76026d12226a5fb6b429c231446d8d595f7b51b7c0c0fbf6251a81af9fec4c0df43b546524bb81e182b796c875b4a6709b491262c42e45e78c5874de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "voms-doc"
RDEPENDS:${PN} += ""

inherit rpm
