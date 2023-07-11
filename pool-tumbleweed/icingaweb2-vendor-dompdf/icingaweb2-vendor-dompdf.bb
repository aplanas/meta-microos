SUMMARY = "Icinga Web 2 vendor library dompdf"
DESCRIPTION = "Icinga Web 2 vendor library dompdf."
LICENSE = "LGPL-2.1-only"

PV = "2.11.4"

RPM_NAME = "icingaweb2-vendor-dompdf-2.11.4-3.1.noarch.rpm"
RPM_HASH = "884b0fa91156ace26db110248f1a073497fcb511fa070745bacfa835e0836f8e0af7c6423aae4fcd99d5be1a02c56d6680ac04dd00674bdde65059dd8328d8c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icingaweb2-vendor-dompdf"

RDEPENDS:${PN} += "icingaweb2-common \
php"

inherit rpm
