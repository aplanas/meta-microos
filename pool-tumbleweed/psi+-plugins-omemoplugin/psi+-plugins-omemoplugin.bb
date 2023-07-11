SUMMARY = "Plugin for Psi"
DESCRIPTION = "OMEMO Multi-End Message and Object Encryption."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-omemoplugin-1.5.1615+0-3.2.aarch64.rpm"
RPM_HASH = "b3179e37d02353557a593d01959be037ba9c4dbcd1a608423f446ef2f31d7c11d2cff8f30d07909b1ba611b3be00ec00e4487a295f4ba7567f30b025cf4bd7b1"

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
