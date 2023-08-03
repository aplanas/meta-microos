SUMMARY = "Documentation for qt6-coap in QCH format"
DESCRIPTION = "This package contains documentation for qt6-coap in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-coap-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "270d34e02a3e79950a105d22d28311c45e3a72add139c8c2f3329f2ab4792cc55f21b716a815e90573cab31a4ad056a81cee178c1b38c2abff560763a43ff2c2"

RPROVIDES:${PN} += "qt6-coap-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
