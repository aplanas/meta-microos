SUMMARY = "Automatic controlled reboot during a maintenance window"
DESCRIPTION = "RebootManager is a dbus service to execute a controlled reboot after updates in a defined maintenance window. \
 \
If you updated a system with e.g. transactional updates or a kernel update was applied, you can tell rebootmgrd with rebootmgrctl, that the machine should be reboot at the next possible time. This can either be immeaditly or during a defined maintenance window."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "2.0"

RPM_NAME = "rebootmgr-2.0-1.3.aarch64.rpm"
RPM_HASH = "5579cf50fa547e8d910c67fce68548531bc81233c021870aaace127879f4df8edb88a95bd8c07cd45299e27ee724bb8b73b724a41fb0369325021cd5e8a37d2c"

RPROVIDES:${PN} += "rebootmgr"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libeconf.so.0"

inherit rpm
