SUMMARY = "Documentation for OpenStack reports library"
DESCRIPTION = "The project oslo.reports hosts a general purpose error report generation \
framework, known as the 'guru meditation report'. \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python-oslo.reports-doc-2.4.0-1.4.noarch.rpm"
RPM_HASH = "9b37d03bc6409cb48c6aa933bc7fe9a0e74f83209c1bd914b514ca4679b431e027e5abfc29c031c821f605f9985c88782cbcc69e4194557e86851cdd1b24c0ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.reports-doc"
RDEPENDS:${PN} += ""

inherit rpm
