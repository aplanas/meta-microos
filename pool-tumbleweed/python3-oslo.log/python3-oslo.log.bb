SUMMARY = "OpenStack log library"
DESCRIPTION = "OpenStack logging configuration library provides standardized configuration \
for all openstack projects.It also provides custom formatters, handlers and \
support for context specific logging (like resource id's etc). \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "5.2.0"

RPM_NAME = "python3-oslo.log-5.2.0-2.1.noarch.rpm"
RPM_HASH = "63e8854f52f6bd498d969659cf03a2e65d0d686080019db32b9282ad8d111d5891ceb157f28d0303cf813e36e388d3c0ed13a9782529eaaed28221c76842ff65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.log \
python3.11dist-oslo.log \
python3dist-oslo.log"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-debtcollector \
python3-monotonic \
python3-oslo.config \
python3-oslo.context \
python3-oslo.i18n \
python3-oslo.serialization \
python3-oslo.utils \
python3-pyinotify \
python3-python-dateutil \
python3-systemd"

inherit rpm
