SUMMARY = "Configuration files for persistent reservation helper"
DESCRIPTION = "The pr-helper-conf package provides configuration files for persistent \
reservation helper"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-pr-helper-conf-1.0.0-7.1.aarch64.rpm"
RPM_HASH = "af0309e78a79229c7048be5b1eb51be1466a34ade360c3762c0af21666dfc5b8ce00dc34a629c52cf57e27c82a07b0ad3c0d04ba9547fdfb0ab911e27ed423af"

RPROVIDES:${PN} += "kubevirt-pr-helper-conf"

RDEPENDS:${PN} += ""

inherit rpm
