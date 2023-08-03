SUMMARY = "Documentation for qt6-remoteobjects in QCH format"
DESCRIPTION = "This package contains documentation for qt6-remoteobjects in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-remoteobjects-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "bbd40be58fb6391af6872570480c3a656b4fcbd3da6de074b9b469b6965664e4add1dec8f8d31efbeef1e43858039edcc03435def6b91bc7b01c93ed91bac6fb"

RPROVIDES:${PN} += "qt6-remoteobjects-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
