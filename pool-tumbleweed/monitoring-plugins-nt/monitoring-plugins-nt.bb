SUMMARY = "Collect data from NSClient service"
DESCRIPTION = "This plugin collects data from the NSClient service running on a \
Windows NT/2000/XP/2003 server."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-nt-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "5d428d4959d7ba67f93e85b06d4fd42151281b0bd78b9a1ea8ac02993fc9ee20eff7609f5889ccd695d9d258d4dc128f871a345f65dd28173bd83bc3f9e7e134"

RPROVIDES:${PN} += "monitoring-plugins-nt \
monitoring-plugins-nt(aarch-64) \
nagios-plugins-nt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
