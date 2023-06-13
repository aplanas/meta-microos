SUMMARY = "Check number of users currently logged in"
DESCRIPTION = "This plugin checks the number of users currently logged in on the local system \
and generates an error if the number exceeds the thresholds specified."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-users-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "c09851091d6d1ba114c5e963ba863f7b43abf5847faef0b2d1c04e68733008922100abb92679c60448e98b843a3713fed16cb0180998fd29cc3b793342ad069d"

RPROVIDES:${PN} += "config(monitoring-plugins-users) \
monitoring-plugins-users \
monitoring-plugins-users(aarch-64) \
nagios-plugins-users"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
