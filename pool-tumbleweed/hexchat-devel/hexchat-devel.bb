SUMMARY = "Development Files for HexChat"
DESCRIPTION = "This package includes files needed to develop HexChat modules."
LICENSE = "GPL-2.0-or-later"

PV = "2.16.1"

RPM_NAME = "hexchat-devel-2.16.1-2.7.aarch64.rpm"
RPM_HASH = "4ddbc5f4a72988033d24dbd19776042c22adc173882d2ea1dfc162028cf568f6b68d18af57f83789825d7915a397b808d2b156c4bcec6b429abf9ff5359b1ad5"

RPROVIDES:${PN} += "hexchat-devel \
pkgconfig-hexchat-plugin"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
hexchat"

inherit rpm
