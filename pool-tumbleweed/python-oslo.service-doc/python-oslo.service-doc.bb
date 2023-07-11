SUMMARY = "Documentation for OpenStack service library"
DESCRIPTION = "oslo.service provides a framework for defining new long-running services using \
the patterns established by other OpenStack applications. It also includes \
utilities long-running applications might need for working with SSL or WSGI, \
performing periodic operations, interacting with systemd, etc. \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "python-oslo.service-doc-3.1.1-1.4.noarch.rpm"
RPM_HASH = "000878771536438942e436ec2352b9e86e9af83144d34106a23408b4272b040af8bdbbb03c76b90a08ef2ecab5c755b3f9a50dbb972a2363cb95b3d1a1f3a47b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.service-doc"

RDEPENDS:${PN} += ""

inherit rpm
