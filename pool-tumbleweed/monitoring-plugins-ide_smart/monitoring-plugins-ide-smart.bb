SUMMARY = "Check local hard drive"
DESCRIPTION = "This plugin checks a local hard drive with the (Linux specific) SMART \
interface. \
 \
Please read \
/usr/share/doc/packages/monitoring-plugins-ide_smart/README.SUSE-check_ide_smart \
for details how to setup this check."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-ide_smart-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "d4a08c41658fe969a7b402cfc1cc355ca3bb487f00776bab8f724888317e7832dc3f65b7dedf16342bbd7344ec25f8dff0ee4c8deab5609d4fb120c8f01309bc"

RPROVIDES:${PN} += "config-monitoring-plugins-ide-smart \
monitoring-plugins-ide-smart \
nagios-plugins-ide-smart"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
