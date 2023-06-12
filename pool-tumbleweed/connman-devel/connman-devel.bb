SUMMARY = "Development files for Connection Manager"
DESCRIPTION = "connman-devel contains development files for use with connman."
LICENSE = "GPL-2.0-only"

PV = "1.41"

RPM_NAME = "connman-devel-1.41-4.7.aarch64.rpm"
RPM_HASH = "4296f248077c94e8e856140e1f3b2fb5fca44a7aec180db9f72f253554f4463d69077246f1768b2a1444884e2cc8b6bfee8e259b141ef04ae8fa4247dd4bbbdd"

RPROVIDES:${PN} += "connman-devel \
connman-devel(aarch-64) \
pkgconfig(connman)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
connman \
pkgconfig(dbus-1) \
pkgconfig(glib-2.0)"

inherit rpm
