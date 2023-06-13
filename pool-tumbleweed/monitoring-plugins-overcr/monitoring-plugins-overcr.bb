SUMMARY = "Check Over-CR collector daemon"
DESCRIPTION = "This plugin attempts to contact the Over-CR collector daemon running on the \
remote UNIX server in order to gather the requested system information."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-overcr-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "5663594969e5ee182125a857c034ab198310f556cd498057d1513d5129bf1c88e1c3c7809d84a2b1eba4617144e51793633afc13367081367f1f6714bec0f61f"

RPROVIDES:${PN} += "monitoring-plugins-overcr \
monitoring-plugins-overcr(aarch-64) \
nagios-plugins-overcr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
