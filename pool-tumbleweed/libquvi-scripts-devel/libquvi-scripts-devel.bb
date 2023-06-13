SUMMARY = "Lua scripts used by libquvi -- Development Files"
DESCRIPTION = "libquvi-scripts contains the embedded lua scripts that libquvi uses for \
parsing the media details. Some additional utility scripts are also \
included."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.20131130"

RPM_NAME = "libquvi-scripts-devel-0.9.20131130-4.7.aarch64.rpm"
RPM_HASH = "202b830b4e325ebff44ee84d7586ac3ff22050b285109726608ab485643d7fdfb31157ff3131219da0e44e888f0ebd3ed6b5acaa8cf891fe06708defa3c4f885"

RPROVIDES:${PN} += "libquvi-scripts-devel \
libquvi-scripts-devel(aarch-64) \
pkgconfig(libquvi-scripts-0.9)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libquvi-scripts"

inherit rpm
