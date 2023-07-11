SUMMARY = "Log file pattern detector"
DESCRIPTION = "This plugin provides a log file pattern detector - excluding old \
logfile entries and searching for the given query."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-log-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "bfc8523090e112f7d81c25c8d7dc5682263c3b0d221a032c6538c2baa53367d03607f5d8858e5806cb10999460248e152891a8a1cd5928704c2a2c93ee6b7830"

RPROVIDES:${PN} += "monitoring-plugins-log \
nagios-plugins-log"

RDEPENDS:${PN} += "/usr/bin/sh \
monitoring-plugins-common"

inherit rpm
