SUMMARY = "PostScript support for the Okular document viewer"
DESCRIPTION = "Document viewing program; supports document in PDF, PS and \
many other formats. This package contains the plugins required \
to display PostScript documents and images."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "23.08.0"

RPM_NAME = "okular-spectre-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "fd4ba009562af95608bd2ac60455df3feae5622acdde87af0430fba9134049a38ee565fde87de98fccb0d1c1b75b61895e911fe6d0f0f667794dd281ed10dd0c"

RPROVIDES:${PN} += "okular-spectre"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libOkular5Core.so.11 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libspectre.so.1 \
libstdc++.so.6 \
okular"

inherit rpm
