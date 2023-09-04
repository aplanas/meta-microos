SUMMARY = "Convenience classes for QtDBus: CLI tools"
DESCRIPTION = "KDBusAddons provides convenience classes on top of QtDBus, as well as an API to \
create KDED modules. Aditional CLI tools."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kdbusaddons-tools-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "a3f09b1e95ca9dc26ce6d40413c0a255fb57dfe838b7ac0052ef10eb3714f95276eac4a0ed378e2685114091c666ffd2a4d6609faedfd4dcf89d32a32977df10"

RPROVIDES:${PN} += "kdbusaddons-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6"

inherit rpm
