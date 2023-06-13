SUMMARY = "Manual for Multi-Schema Validator"
DESCRIPTION = "Manual for Multi-Schema Validator."
LICENSE = "BSD-3-Clause"

PV = "2013.6.1"

RPM_NAME = "msv-manual-2013.6.1-3.10.noarch.rpm"
RPM_HASH = "d35a809021b92a84941423b56858915b2feab0994b3078a04fc09ec57057fdf8d6c9e35111352c00e121d28701ff4e3c386fbb6c3443ceb36f69eaaf63d85dcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "msv-manual"

RDEPENDS:${PN} += ""

inherit rpm
