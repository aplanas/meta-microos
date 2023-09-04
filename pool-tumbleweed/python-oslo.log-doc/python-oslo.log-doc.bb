SUMMARY = "Documentation for OpenStack log library"
DESCRIPTION = "Documentation for the oslo.log library."
LICENSE = "Apache-2.0"

PV = "5.2.0"

RPM_NAME = "python-oslo.log-doc-5.2.0-2.1.noarch.rpm"
RPM_HASH = "e6991e251bc15f0b6e7e429e841f0dc1a0442bd4dea82bb6a3575b1a323589a5a4a64444594b869582a3304101cac2191eeabdb2b8f56083226f8737adeb3f2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.log-doc"

RDEPENDS:${PN} += ""

inherit rpm
