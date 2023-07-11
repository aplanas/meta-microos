SUMMARY = "Library For Reading PhotoCD Images"
DESCRIPTION = "Header files for library for reading PhotoCD images."
LICENSE = "GPL-2.0+"

PV = "1.0.1"

RPM_NAME = "libpcd-devel-1.0.1-9.29.aarch64.rpm"
RPM_HASH = "2ae90a917bd03e750dd713a8eef00f3708bb96018cce93dc2c8f0f0f1c6495b56adfdb22e08dc3022fe35f22dd17bf949ea76637c3ec6f5694e96ca777b8a472"

RPROVIDES:${PN} += "libpcd-devel"

RDEPENDS:${PN} += "libpcd2"

inherit rpm
