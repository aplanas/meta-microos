SUMMARY = "Documentation for audaspace"
DESCRIPTION = "The audaspace-doc package contains documentation for \
developing applications that use audaspace."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "audaspace-doc-1.4.0-1.5.noarch.rpm"
RPM_HASH = "8b94becb9e2865fe0408a1fc20be046f55134e2eb8671a18c5d5e96f4fdc6f56fa45a7e187aa044dc5efeb05881fed07ffefa33b937dbef10d4dc082fe00500d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "audaspace-doc"

RDEPENDS:${PN} += ""

inherit rpm
