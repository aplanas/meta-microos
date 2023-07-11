SUMMARY = "Documentation for OpenStack log library"
DESCRIPTION = "Documentation for the oslo.log library."
LICENSE = "Apache-2.0"

PV = "5.2.0"

RPM_NAME = "python-oslo.log-doc-5.2.0-1.2.noarch.rpm"
RPM_HASH = "590c3631e5ac96790bf54c56d8a4a7567433c4463ff80e899b07c1031211245fef0122cb2056cf99e0f0c32d8eb6da17afa2203ed37267f185c3bef9bb7cabbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.log-doc"

RDEPENDS:${PN} += ""

inherit rpm
