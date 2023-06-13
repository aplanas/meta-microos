SUMMARY = "Documentation for OpenStack log library"
DESCRIPTION = "Documentation for the oslo.log library."
LICENSE = "Apache-2.0"

PV = "5.2.0"

RPM_NAME = "python-oslo.log-doc-5.2.0-1.1.noarch.rpm"
RPM_HASH = "20e9c5e3f2da139f0868e5e36e5e98ec20a94431bb51a3ac3e2827abec6b6b97f9f3a63a21824bfbd8cdc7c092935af9639aaff18782824848814b8fa5756d20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.log-doc"

RDEPENDS:${PN} += ""

inherit rpm
