SUMMARY = "Log file pattern detector"
DESCRIPTION = "This plugin provides a log file pattern detector - excluding old \
logfile entries and searching for the given query."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-log-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "15d9be894378fd6475e45765a87407399efb6ffb52d80e7fc1e6ff2f238acc98f66a860307d568e6d9739cb47811523d2f061b36ef4823a089a393fdb82dfdf0"

RPROVIDES:${PN} += "monitoring-plugins-log \
nagios-plugins-log"

RDEPENDS:${PN} += "/bin/sh \
monitoring-plugins-common"

inherit rpm
