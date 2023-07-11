SUMMARY = "Oslo VMware library for OpenStack projects"
DESCRIPTION = "The Oslo project intends to produce a python library containing infrastructure \
code shared by OpenStack projects. The APIs provided by the project should be \
high quality, stable, consistent and generally useful. \
 \
The Oslo VMware library offers session and API call management for VMware ESX/VC \
server. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "4.1.1"

RPM_NAME = "python3-oslo.vmware-4.1.1-1.3.noarch.rpm"
RPM_HASH = "abaeb602e853c56866b92f3aa18c7e0a1e6a15c542188884c545ed9bfe16ca5dd91912476cc63c0535190c450eb9688158ce517377f46e50cf4c578e9dfdbcfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.vmware \
python3.11dist-oslo.vmware \
python3dist-oslo.vmware"

RDEPENDS:${PN} += "python-abi \
python3-PyYAML \
python3-eventlet \
python3-lxml \
python3-netaddr \
python3-oslo.concurrency \
python3-oslo.context \
python3-oslo.i18n \
python3-oslo.utils \
python3-requests \
python3-stevedore \
python3-suds-community \
python3-urllib3"

inherit rpm
