SUMMARY = "PostScript support for the Okular document viewer"
DESCRIPTION = "Document viewing program; supports document in PDF, PS and \
many other formats. This package contains the plugins required \
to display PostScript documents and images."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "okular-spectre-23.04.1-1.2.aarch64.rpm"
RPM_HASH = "40aa514def2fee90ff4c1339177a35d7f7f1e3be61fc7760ed3451a640cec8b886276563da317ffccf98c36e1513a2ddc971b06a6ccbc8e06fedb00f01f7f402"

RPROVIDES:${PN} += "application() \
application(okularApplication_ghostview.desktop) \
metainfo() \
metainfo(org.kde.okular-spectre.metainfo.xml) \
mimehandler(application/postscript) \
mimehandler(application/x-bzpostscript) \
mimehandler(application/x-gzpostscript) \
mimehandler(image/x-bzeps) \
mimehandler(image/x-eps) \
mimehandler(image/x-gzeps) \
okular-spectre \
okular-spectre(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libOkular5Core.so.10()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libspectre.so.1()(64bit) \
libstdc++.so.6()(64bit) \
okular"

inherit rpm
