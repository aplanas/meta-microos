SUMMARY = "Installation Image Files for MicroOS"
DESCRIPTION = "Files needed for MicroOS installation media."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "installation-images-MicroOS-17.91-1.98.aarch64.rpm"
RPM_HASH = "c215fc6be103b8b8fe28312525043284bf6c66bf526a56907761b98fad041d2e89bb31a2245d81712f58df8414b658d25bfbc22848aafa8bf0abb8bc3f2370ef"

RPROVIDES:${PN} += "installation-images \
installation-images-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
