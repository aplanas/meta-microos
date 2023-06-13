SUMMARY = "Glib integration for DBus"
DESCRIPTION = "This package provides glib integration for Mono.DBus."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "dbus-sharp-glib2-0.6.0-2.8.noarch.rpm"
RPM_HASH = "6c2601d27c63d4aa6f9e3a1082388b46f4569f74aa080359713351d49e148e8a4c5a2aeded2b66c90e84b188cfaae4538770562b18c57c14928c31071bcb4e0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dbus-sharp-glib2 \
mono(dbus-sharp-glib)"

RDEPENDS:${PN} += "dbus-sharp \
mono(dbus-sharp) \
mono(mscorlib)"

inherit rpm
