SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to display x-statuses of contacts using the QIP Infium \
jabber client."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-qipxstatusesplugin-1.5.1615+0-3.2.aarch64.rpm"
RPM_HASH = "70359a919a998700cf77f5af5cb6b4355942557d75ad3bf0656cfb93dd507208e8c7e6554622ca72d7f0f933c5784b88ee11920e8d11f3357ac8239761413b62"

RPROVIDES:${PN} += "libqipxstatusesplugin.so \
psi+-plugins-qipxstatusesplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
psi+"

inherit rpm
