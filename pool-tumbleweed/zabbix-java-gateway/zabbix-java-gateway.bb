SUMMARY = "Zabbix Java gateway"
DESCRIPTION = "JMX monitoring can be used to monitor JMX counters of a Java \
application. To retrieve the value of a particular JMX counter on a \
host, the Zabbix server queries the Zabbix Java gateway, which in \
turn uses the JMX management API to query the application of interest \
remotely."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.17"

RPM_NAME = "zabbix-java-gateway-6.0.17-1.1.aarch64.rpm"
RPM_HASH = "0bf79456e390a3e58725c7bb9427e659d5d102d335023c5d0e89300e108756694a6916c19b13eb0019376c74fb0321829c00482dae97ea9c0fb18a443cb8419b"

RPROVIDES:${PN} += "config-zabbix-java-gateway \
zabbix \
zabbix-java-gateway"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
jre \
shadow"

inherit rpm
