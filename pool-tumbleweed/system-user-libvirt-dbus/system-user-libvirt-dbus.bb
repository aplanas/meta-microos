SUMMARY = "System user for libvirt-dbus"
DESCRIPTION = "System user for libvirt-dbus."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.1"

RPM_NAME = "system-user-libvirt-dbus-1.4.1-3.8.noarch.rpm"
RPM_HASH = "b373c76b56b267eb983fb5a577f96fb78a3d60bec8139e010ed49ac1127f825dbd29e610b557d7895e37a6ee6fe75e8b3b217246a550a74a41efef51adcf41dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-libvirtdbus \
system-user-libvirt-dbus \
user-libvirtdbus"

RDEPENDS:${PN} += "/usr/bin/sh \
group-libvirt \
sysuser-shadow"

inherit rpm
