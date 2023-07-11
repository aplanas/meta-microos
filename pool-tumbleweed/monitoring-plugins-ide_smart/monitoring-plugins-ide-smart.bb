SUMMARY = "Check local hard drive"
DESCRIPTION = "This plugin checks a local hard drive with the (Linux specific) SMART \
interface. \
 \
Please read \
/usr/share/doc/packages/monitoring-plugins-ide_smart/README.SUSE-check_ide_smart \
for details how to setup this check."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-ide_smart-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "cc75e4e693b30534995ddb672dba19f687a11201adf3aa37df2c28fa0be6650c4f2d4ed01e4c2496e12763eae284a2f437a3634608f423ae47ded9eb99b15469"

RPROVIDES:${PN} += "config-monitoring-plugins-ide-smart \
monitoring-plugins-ide-smart \
nagios-plugins-ide-smart"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
