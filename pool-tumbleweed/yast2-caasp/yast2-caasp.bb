SUMMARY = "YaST2 - CaaSP Module"
DESCRIPTION = "Containers as a Service Platform (CaaSP) and openSUSE Kubic specific module."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-caasp-4.6.0-1.1.noarch.rpm"
RPM_HASH = "18b1be80bab2001d3c5379e34702d3e9b88f5fdfedbedf100f45201591f74c4df9c25d7de8f788f3c54387ed175e780bd135735c05bdf8e7571bc3e54f15c5f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-caasp"

RDEPENDS:${PN} += "yast2 \
yast2-installation \
yast2-network \
yast2-ntp-client"

inherit rpm
