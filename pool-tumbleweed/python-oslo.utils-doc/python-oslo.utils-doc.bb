SUMMARY = "Documentation for OpenStack utils library"
DESCRIPTION = "Documentation for OpenStack utils library."
LICENSE = "Apache-2.0"

PV = "6.1.0"

RPM_NAME = "python-oslo.utils-doc-6.1.0-1.4.noarch.rpm"
RPM_HASH = "6ae5c3b5feb5f5135d4f8ec5d278c2668d4ec64b950e5e25624e4004633689121900318ba26d1a5700f51d63c92c54fa934eddc8f1471abe79e08fc031b8a755"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.utils-doc"

RDEPENDS:${PN} += ""

inherit rpm
