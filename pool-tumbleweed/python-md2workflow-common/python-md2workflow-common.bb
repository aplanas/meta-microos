SUMMARY = "Configuration and examples for md2workflow"
DESCRIPTION = "Configuration and examples for md2workflow"
LICENSE = "GPL-3.0-only"

PV = "1.4.18"

RPM_NAME = "python-md2workflow-common-1.4.18-4.13.noarch.rpm"
RPM_HASH = "6ce1272500eb2036dea9353f3721c5240e8306e8d7297c9790552572473e22fbc8b902b2fdb3c2244ac3fe4cd2eba9a094362fab106959bc0a941dfd03c5e161"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-md2workflow-common \
python310-md2workflow-common \
python311-md2workflow-common \
python39-md2workflow-common"

RDEPENDS:${PN} += ""

inherit rpm
