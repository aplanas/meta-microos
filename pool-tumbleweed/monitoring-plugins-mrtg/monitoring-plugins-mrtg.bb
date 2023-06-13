SUMMARY = "Check average or maximum value in an MRTG logfile"
DESCRIPTION = "This plugin will check either the average or maximum value of one of the \
two variables recorded in an MRTG log file."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-mrtg-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "980ffe11df0390c760d6db78a3840ec144c1d35952d2c9c4496117195d609c3a759c805aab0104efa20097e953ac7081510eb4ba7bcc9dd0c364997ab42b6068"

RPROVIDES:${PN} += "monitoring-plugins-mrtg \
monitoring-plugins-mrtg(aarch-64) \
nagios-plugins-mrtg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
