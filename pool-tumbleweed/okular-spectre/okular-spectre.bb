SUMMARY = "PostScript support for the Okular document viewer"
DESCRIPTION = "Document viewing program; supports document in PDF, PS and \
many other formats. This package contains the plugins required \
to display PostScript documents and images."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "okular-spectre-23.04.1-1.2.aarch64.rpm"
RPM_HASH = "40aa514def2fee90ff4c1339177a35d7f7f1e3be61fc7760ed3451a640cec8b886276563da317ffccf98c36e1513a2ddc971b06a6ccbc8e06fedb00f01f7f402"

RPROVIDES:${PN} += "okular-spectre"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libOkular5Core.so.10 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libspectre.so.1 \
libstdc++.so.6 \
okular"

inherit rpm
