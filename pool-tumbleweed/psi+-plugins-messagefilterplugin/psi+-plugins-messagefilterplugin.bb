SUMMARY = "Plugin for Psi"
DESCRIPTION = "A Psi plugin for filtering messages."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-messagefilterplugin-1.5.1615+0-3.2.aarch64.rpm"
RPM_HASH = "c9b2968ac287ec29019d0704448643353a9671b721d02f340ee4f47ee27f9888cbe47bdc052f25c468398f8db1d288e8d9de69c5df72ec03b2e6a7e64b8312e7"

RPROVIDES:${PN} += "libmessagefilterplugin.so \
psi+-plugins-messagefilterplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
psi+"

inherit rpm
