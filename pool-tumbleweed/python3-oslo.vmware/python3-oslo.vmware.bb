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

RPM_NAME = "python3-oslo.vmware-4.1.1-1.2.noarch.rpm"
RPM_HASH = "6c3a91b35e02e62a5a34771cf66ae33f8ce939a51b50ef7e5eff64c30cd37911be4a8eb6699705c4f903de8a35791e7725c1148e123c8353fe0cb63d783f61da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.vmware \
python3.10dist(oslo.vmware) \
python3dist(oslo.vmware)"

RDEPENDS:${PN} += "python(abi) \
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
