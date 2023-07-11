SUMMARY = "Documentation for OpenStack common VMware library"
DESCRIPTION = "Documentation for OpenStack common VMware library."
LICENSE = "Apache-2.0"

PV = "4.1.1"

RPM_NAME = "python-oslo.vmware-doc-4.1.1-1.3.noarch.rpm"
RPM_HASH = "227ee3e97b7d8d3ae6978d06f9d55350e4cf1da2608cd035b53c5fb2fbc682571855d1a660e24ef84d95203661b94368cbe18a368f2a67e9c9060b9417adceb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.vmware-doc"

RDEPENDS:${PN} += ""

inherit rpm
