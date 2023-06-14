SUMMARY = "All Monitoring Plugins for collectd"
DESCRIPTION = "Metapackage that installs collectd and all the available \
monitoring plugin subpackages."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugins-all-5.12.0.134.g4cebbfc-1.4.noarch.rpm"
RPM_HASH = "c4fc420135f86ab8d38e24ab550c8baf3427dc6c0e85150a97ccc060cbdcae279a7d434c4204430a422660921af4ada1b9fa87843d508d0816f61119d8ceb039"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "collectd-plugins-all"

RDEPENDS:${PN} += "collectd \
collectd-plugin-amqp \
collectd-plugin-buddyinfo \
collectd-plugin-connectivity \
collectd-plugin-dbi \
collectd-plugin-gps \
collectd-plugin-ipmi \
collectd-plugin-java \
collectd-plugin-logparser \
collectd-plugin-lua \
collectd-plugin-mcelog \
collectd-plugin-memcachec \
collectd-plugin-modbus \
collectd-plugin-mqtt \
collectd-plugin-mysql \
collectd-plugin-notify-desktop \
collectd-plugin-openldap \
collectd-plugin-ovs \
collectd-plugin-pcie \
collectd-plugin-pinba \
collectd-plugin-postgresql \
collectd-plugin-procevent \
collectd-plugin-python3 \
collectd-plugin-sigrok \
collectd-plugin-smart \
collectd-plugin-snmp \
collectd-plugin-synproxy \
collectd-plugin-sysevent \
collectd-plugin-ubi \
collectd-plugin-uptime \
collectd-plugin-virt \
collectd-plugin-write-influxdb-udp \
collectd-plugin-write-stackdriver \
collectd-plugin-write-syslog \
collectd-web \
collectd-web-js"

inherit rpm
