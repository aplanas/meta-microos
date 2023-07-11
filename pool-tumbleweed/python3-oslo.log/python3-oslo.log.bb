SUMMARY = "OpenStack log library"
DESCRIPTION = "OpenStack logging configuration library provides standardized configuration \
for all openstack projects.It also provides custom formatters, handlers and \
support for context specific logging (like resource id's etc). \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "5.2.0"

RPM_NAME = "python3-oslo.log-5.2.0-1.2.noarch.rpm"
RPM_HASH = "730d6fa584b32acd44c40be89e98bff7a2988fd875ae8521282f264741d8166ee3a3abb0b3464ea9b73f5a44cad375bdcff63ba81c14e922cd2b42ac144bcc15"
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
