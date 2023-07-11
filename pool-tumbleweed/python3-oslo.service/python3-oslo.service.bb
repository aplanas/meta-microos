SUMMARY = "OpenStack oslo.service library"
DESCRIPTION = "oslo.service provides a framework for defining new long-running services using \
the patterns established by other OpenStack applications. It also includes \
utilities long-running applications might need for working with SSL or WSGI, \
performing periodic operations, interacting with systemd, etc."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "python3-oslo.service-3.1.1-1.4.noarch.rpm"
RPM_HASH = "7653c4ec51b8b71fec82dc1238a50d2dd4a03bb089cfe840f8f95feea3c6ca6d0c65eb9aed72b5fe13d79176b301db10526e26c7775fa77122cfd62dbe5c9cc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.service \
python3.11dist-oslo.service \
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
