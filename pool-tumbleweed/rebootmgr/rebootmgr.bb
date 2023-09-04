SUMMARY = "Automatic controlled reboot during a maintenance window"
DESCRIPTION = "RebootManager is a dbus service to execute a controlled reboot after updates in a defined maintenance window. \
 \
If you updated a system with e.g. transactional updates or a kernel update was applied, you can tell rebootmgrd with rebootmgrctl, that the machine should be reboot at the next possible time. This can either be immediately or during a defined maintenance window."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "2.1"

RPM_NAME = "rebootmgr-2.1-1.1.aarch64.rpm"
RPM_HASH = "2bfb29d3f422b70ca668c6cad80778f5f31be4821bd403a7e626c8b9d5c94d4765b6958eb715331f8c14a2e44a09c34af8ba2ccab8de8bc9b4de3ca14aca3a2f"

RPROVIDES:${PN} += "rebootmgr"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libeconf.so.0"

inherit rpm
