SUMMARY = "IPMI Sensor 1 Monitoring Plugin"
DESCRIPTION = "This plugin checks all IPMI sensors of a server remotely or locally. It works \
with any IPMI-compatible server, so you can use it also in heterogeneous \
environments with different server vendors. \
 \
This version 1.x is based on ipmitool and can only monitor threshold based \
sensors."
LICENSE = "GPL-3.0+"

PV = "1.3"

RPM_NAME = "monitoring-plugins-ipmi-sensor1-1.3-104.14.noarch.rpm"
RPM_HASH = "2b8f7d05b61f1cf3d1061684fc3087426cde20aad3b0a991d408e0365a43261bdd1778132316aaa4990418af1077f29f635e91f9b3d573a33ef98553fa2292b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-monitoring-plugins-ipmi-sensor1 \
monitoring-plugins-ipmi-sensor1 \
nagios-plugins-ipmi-sensor1"

RDEPENDS:${PN} += "/usr/bin/bash \
ipmitool"

inherit rpm
