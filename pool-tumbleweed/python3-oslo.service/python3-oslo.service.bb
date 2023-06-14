SUMMARY = "OpenStack oslo.service library"
DESCRIPTION = "oslo.service provides a framework for defining new long-running services using \
the patterns established by other OpenStack applications. It also includes \
utilities long-running applications might need for working with SSL or WSGI, \
performing periodic operations, interacting with systemd, etc."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "python3-oslo.service-3.1.1-1.3.noarch.rpm"
RPM_HASH = "0a8fab98b6cbd7d77ba82181b8a5d7be2cf507acc46167e1a37028b99fdcf860ebd39b6bfa1bfda63ff04ce4adcddd660ff23ee4effbf6e3fe8115c8ad160955"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.service \
python3.10dist-oslo.service \
python3dist-oslo.service"

RDEPENDS:${PN} += "python-abi \
python3-Paste \
python3-PasteDeploy \
python3-Routes \
python3-WebOb \
python3-debtcollector \
python3-eventlet \
python3-fixtures \
python3-greenlet \
python3-oslo.concurrency \
python3-oslo.config \
python3-oslo.i18n \
python3-oslo.log \
python3-oslo.utils \
python3-yappi"

inherit rpm
