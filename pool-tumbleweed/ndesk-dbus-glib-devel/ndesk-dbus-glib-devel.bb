SUMMARY = "Ndesk-dbus-glib provides glib integration for NDesk.DBus"
DESCRIPTION = "Ndesk-dbus-glibl provides glib integration for NDesk.DBus"
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "ndesk-dbus-glib-devel-0.4.1-59.18.noarch.rpm"
RPM_HASH = "95a2366cb68201cb48e33e95be6904107420af38e7808d6f4d5b45b7f5d834c59c036f2c5f5848e325aca3aa6e7df6742ad1d5578b59c848b96f86450e4a8236"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ndesk-dbus-glib-devel \
pkgconfig-ndesk-dbus-glib-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ndesk-dbus-glib \
pkgconfig-ndesk-dbus-1.0"

inherit rpm
