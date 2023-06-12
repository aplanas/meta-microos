SUMMARY = "Swahili (Kiswahili) Dictionary for Aspell"
DESCRIPTION = "A Swahili (Kiswahili) dictionary for the aspell spell checker."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0"

RPM_NAME = "aspell-sw-1.0-2.14.aarch64.rpm"
RPM_HASH = "4c145381059970850da873983240c212c88838a33d66859153b9f9b4e3885466de7779060687d3d8a634f66cc84ea9ba0acc1a85f38c0b61317c37fd3ac1d980"

RPROVIDES:${PN} += "aspell-sw \
aspell-sw(aarch-64) \
locale(aspell:sw)"
RDEPENDS:${PN} += ""

inherit rpm
