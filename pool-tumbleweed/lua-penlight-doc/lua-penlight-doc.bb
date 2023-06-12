SUMMARY = "Documentation for lua-penlight"
DESCRIPTION = "Documentation for the package lua-penlight"
LICENSE = "MIT"

PV = "1.13.1"

RPM_NAME = "lua-penlight-doc-1.13.1-2.2.noarch.rpm"
RPM_HASH = "0fbb24e63de4c871ea0dd5c3d8eb354f595fa14cf0389353de98fdaafe776370101e8d821c7d7d20ba4573671eb8fea09781805e3aa781d0956292b1db291cdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-penlight-doc"
RDEPENDS:${PN} += ""

inherit rpm
