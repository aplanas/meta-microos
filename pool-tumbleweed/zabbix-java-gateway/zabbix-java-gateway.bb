SUMMARY = "Zabbix Java gateway"
DESCRIPTION = "JMX monitoring can be used to monitor JMX counters of a Java \
application. To retrieve the value of a particular JMX counter on a \
host, the Zabbix server queries the Zabbix Java gateway, which in \
turn uses the JMX management API to query the application of interest \
remotely."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.19"

RPM_NAME = "zabbix-java-gateway-6.0.19-1.1.aarch64.rpm"
RPM_HASH = "d0cd32a17ee4af6ae532d584c12b1fb1ea62ce43600d53a25d4a42e574827cb99dd1dc7bcfc422b4ffd7b1c61e105f7b055ad9c1dd717fb4f3b488d3c9d096b8"

RPROVIDES:${PN} += "config-zabbix-java-gateway \
zabbix \
zabbix-java-gateway"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
jre \
shadow"

inherit rpm
