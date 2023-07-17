SUMMARY = "Convenience classes for QtDBus: CLI tools"
DESCRIPTION = "KDBusAddons provides convenience classes on top of QtDBus, as well as an API to \
create KDED modules. Aditional CLI tools."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kdbusaddons-tools-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "6692cacbdac1edca01cc91b902b42702f59c3c4af65b3bdd0aeabbc1fbe800454b1b9eae54b5283406dbf462dafaa071e3cbf27d4163f06792be557749676a40"

RPROVIDES:${PN} += "kdbusaddons-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6"

inherit rpm
