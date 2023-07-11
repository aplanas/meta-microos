SUMMARY = "Zabbix Java gateway"
DESCRIPTION = "JMX monitoring can be used to monitor JMX counters of a Java \
application. To retrieve the value of a particular JMX counter on a \
host, the Zabbix server queries the Zabbix Java gateway, which in \
turn uses the JMX management API to query the application of interest \
remotely."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.17"

RPM_NAME = "zabbix-java-gateway-6.0.17-1.2.aarch64.rpm"
RPM_HASH = "c2708790cff4ee17afcce8a8c389035438386d010d53b9a5d5e71ed73786aec6356bb41857174d6a1848ae6ecb023b28ea79261ad943248f383d8db5506cb5c8"

RPROVIDES:${PN} += "config-zabbix-java-gateway \
zabbix \
zabbix-java-gateway"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
jre \
shadow"

inherit rpm
