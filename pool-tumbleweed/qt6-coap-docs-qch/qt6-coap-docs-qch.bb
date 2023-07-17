SUMMARY = "Documentation for qt6-coap in QCH format"
DESCRIPTION = "This package contains documentation for qt6-coap in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-coap-docs-qch-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "6f6ae2225da6cd5d46f16fdc70f146dc8587397d183d3e0ca570f8117d274c24a07b50a9216e048ca344c41f45b4574838b8ec7a7edd72e3381ebfd39a43fdda"

RPROVIDES:${PN} += "qt6-coap-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
