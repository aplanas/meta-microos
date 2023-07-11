SUMMARY = "Convenience classes for QtDBus: CLI tools"
DESCRIPTION = "KDBusAddons provides convenience classes on top of QtDBus, as well as an API to \
create KDED modules. Aditional CLI tools."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kdbusaddons-tools-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "edb809b8c74e9dc9e31b639e24df53e263dcf27e58ecfb1c90677906825d1087458e8f45f786d765c4ee57584915ed9f335493420e905d4cbb34b3974d187350"

RPROVIDES:${PN} += "kdbusaddons-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6"

inherit rpm
