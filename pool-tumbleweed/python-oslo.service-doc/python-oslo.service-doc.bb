SUMMARY = "Documentation for OpenStack service library"
DESCRIPTION = "oslo.service provides a framework for defining new long-running services using \
the patterns established by other OpenStack applications. It also includes \
utilities long-running applications might need for working with SSL or WSGI, \
performing periodic operations, interacting with systemd, etc. \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "python-oslo.service-doc-3.1.1-1.3.noarch.rpm"
RPM_HASH = "c47a09702ff4a4277fafadb48948e92e2555dc280071343477ef21093c84b7c639373c7a4083782181e14434021c00f384a40305643a7b2825ea4f3aa08bb4de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.service-doc"

RDEPENDS:${PN} += ""

inherit rpm
