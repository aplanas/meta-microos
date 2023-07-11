SUMMARY = "PostScript support for the Okular document viewer"
DESCRIPTION = "Document viewing program; supports document in PDF, PS and \
many other formats. This package contains the plugins required \
to display PostScript documents and images."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "23.04.3"

RPM_NAME = "okular-spectre-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "a69534933019975bca4875934bcd43b4df4c61f5df129a331fb30687ed4fa6af16def4790a1e19b3dbdd5fd0cda5fc27000b8af3f8c981d9c053455ede2400a0"

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
