SUMMARY = "Icinga Web 2 vendor library dompdf"
DESCRIPTION = "Icinga Web 2 vendor library dompdf."
LICENSE = "LGPL-2.1-only"

PV = "2.11.4"

RPM_NAME = "icingaweb2-vendor-dompdf-2.11.4-2.1.noarch.rpm"
RPM_HASH = "db716a9e13ef37f94d0cba2bb888441de138911dcd15004647bf1966594744430fbb871d5422652d62203b1020e78fe3840022deaa20bfbd65bb01c5bf95c8d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icingaweb2-vendor-dompdf"

RDEPENDS:${PN} += "icingaweb2-common \
php"

inherit rpm
