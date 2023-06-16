SUMMARY = "Automatic controlled reboot during a maintenance window"
DESCRIPTION = "RebootManager is a dbus service to execute a controlled reboot after updates in a defined maintenance window. \
 \
If you updated a system with e.g. transactional updates or a kernel update was applied, you can tell rebootmgrd with rebootmgrctl, that the machine should be reboot at the next possible time. This can either be immeaditly or during a defined maintenance window."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "2.0"

RPM_NAME = "rebootmgr-2.0-1.2.aarch64.rpm"
RPM_HASH = "c35790631b3bcb20c1257aeaa03f607bcb7318f356ada8fbd818cf89de280fc4f9bdf977704223eead04fbff8527974b41a0e67c4d88f095f9e44022c6a4457b"

RPROVIDES:${PN} += "rebootmgr"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libeconf.so.0"

inherit rpm
