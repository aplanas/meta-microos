SUMMARY = "All Monitoring Plugins for collectd"
DESCRIPTION = "Metapackage that installs collectd and all the available \
monitoring plugin subpackages."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugins-all-5.12.0.134.g4cebbfc-1.6.noarch.rpm"
RPM_HASH = "252107bbaf0a908ff7582afe85df6e101582734bc67aefda5ab2d08cf410a8291548e94e17ed5224ba306bb3a24a526dd5f55fa8f229ef1fcd7480e2e9f56135"
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
