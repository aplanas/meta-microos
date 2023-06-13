SUMMARY = "Test the current system load average"
DESCRIPTION = "This plugin tests the current system load average."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-load-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "0f982aef718e12e25be741fc8dffbc0e1626cf27e1d0a446fbb4246f9e683e7a5eb0e541a78fd0925fb01f41303dcbf8407398b3023b1fc1936ab78f4d71718b"

RPROVIDES:${PN} += "config(monitoring-plugins-load) \
monitoring-plugins-load \
monitoring-plugins-load(aarch-64) \
nagios-plugins-load"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
