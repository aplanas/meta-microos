SUMMARY = "D-Bus message bus daemon"
DESCRIPTION = "D-Bus is a message bus system, This package contains the original \
dbus-daemon to make it easier to switch to dbus-broker"
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "1.14.8"

RPM_NAME = "dbus-1-daemon-1.14.8-1.1.aarch64.rpm"
RPM_HASH = "9d0a979b7913fd9b565a70de88291ec2f6ee18d350b96393cc3601281552938647c30fc0265dbdaa73a65326447aaaced86dd9ca26d4bd1bc22f4d99b21716db"

RPROVIDES:${PN} += "dbus-1-/usr/bin/dbus-daemon \
dbus-1-daemon \
dbus-service"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libdbus-1.so.3 \
libexpat.so.1 \
libselinux.so.1 \
libsystemd.so.0"

inherit rpm
