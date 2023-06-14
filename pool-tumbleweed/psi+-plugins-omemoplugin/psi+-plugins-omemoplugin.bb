SUMMARY = "Plugin for Psi"
DESCRIPTION = "OMEMO Multi-End Message and Object Encryption."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-omemoplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "65aad6759aafc100e12d2c423a8b90870dcba8ba28694e8824820452464c3ecc94f2194da66ed8707f08e2ccc547283c0a20cd45288d188528daabb5f15d97bf"

RPROVIDES:${PN} += "libomemoplugin.so \
psi+-plugins-omemoplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libsignal-protocol-c.so.2 \
libstdc++.so.6 \
psi+"

inherit rpm
