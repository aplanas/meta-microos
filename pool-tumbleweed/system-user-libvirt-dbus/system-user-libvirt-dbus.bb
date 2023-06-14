SUMMARY = "System user for libvirt-dbus"
DESCRIPTION = "System user for libvirt-dbus."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.1"

RPM_NAME = "system-user-libvirt-dbus-1.4.1-3.7.noarch.rpm"
RPM_HASH = "8fbfa9006f4a9bd4c36baa81ba5dfc4bdc4a24bafadca60a8249590daaa2d9e6f48de96d6da148662103be7df7d01b0ee60fefdfc0f72251f7d25e17f509de86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-libvirtdbus \
system-user-libvirt-dbus \
user-libvirtdbus"

RDEPENDS:${PN} += "/bin/sh \
group-libvirt \
sysuser-shadow"

inherit rpm
