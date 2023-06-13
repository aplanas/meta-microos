SUMMARY = "Waitress WSGI server"
DESCRIPTION = "This package contains documentation files for python311-waitress-doc."
LICENSE = "ZPL-2.1"

PV = "2.1.2"

RPM_NAME = "python311-waitress-doc-2.1.2-4.1.noarch.rpm"
RPM_HASH = "e6cde27b5356fff2fc88f0195b146cb7b8235c154a706c38b22dd3ab14764b28ab53380cdabc6ff715048ce305478b9123ca5557d7b62fef38fb94927a047820"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-waitress-doc"

RDEPENDS:${PN} += ""

inherit rpm
