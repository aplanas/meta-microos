SUMMARY = "Development files for yambar"
DESCRIPTION = "Modules for interacting and modifying yambar."
LICENSE = "MIT"

PV = "1.9.0+g34"

RPM_NAME = "yambar-devel-1.9.0+g34-1.4.noarch.rpm"
RPM_HASH = "19b4d66e3911e11144d76b5185e6188e205415200078ccc64eac2d52ec1b53ab849f226e259a074b7cd4719c429e4b202d3165578b73d0e7929079e595797e22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yambar-devel"

RDEPENDS:${PN} += "yambar"

inherit rpm
