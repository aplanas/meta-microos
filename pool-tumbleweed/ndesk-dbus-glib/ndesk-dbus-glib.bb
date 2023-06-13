SUMMARY = "Ndesk-dbus-glib provides glib integration for NDesk.DBus"
DESCRIPTION = "Ndesk-dbus-glibl provides glib integration for NDesk.DBus"
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "ndesk-dbus-glib-0.4.1-59.18.noarch.rpm"
RPM_HASH = "23010b3f574f7ebc4420feec2f8f88c6a3f8ebf459b14e12f1935b40fba17bdc22be24da5fb4d25cb0d7a335fac69b609e3cdc3715ac4fd9aef7f27cdc60a19e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono(NDesk.DBus.GLib) \
ndesk-dbus-glib"

RDEPENDS:${PN} += "mono(NDesk.DBus) \
mono(mscorlib) \
ndesk-dbus"

inherit rpm
