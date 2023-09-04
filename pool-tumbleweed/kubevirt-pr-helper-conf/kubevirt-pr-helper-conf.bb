SUMMARY = "Configuration files for persistent reservation helper"
DESCRIPTION = "The pr-helper-conf package provides configuration files for persistent \
reservation helper"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-pr-helper-conf-1.0.0-6.1.aarch64.rpm"
RPM_HASH = "7709fd0aa144115bd1623cd09942219c073a3601b94019f9652d300a2f48deda9a6cfa2efb66d1e8cda894f9af7a233b2eadd7ad0cfdbf3142a84e4bbd1c1c30"

RPROVIDES:${PN} += "kubevirt-pr-helper-conf"

RDEPENDS:${PN} += ""

inherit rpm
