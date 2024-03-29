SUMMARY = "UML Modeller"
DESCRIPTION = "Umbrello is a UML modelling application."
LICENSE = "GPL-2.0-only & GFDL-1.2-only & GPL-3.0-or-later"

PV = "23.08.0"

RPM_NAME = "umbrello-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "75900531c893a991fcbfa8e0c6e6bfc6127c62436110b8276b84d362f2bded226c282b9214325a41e3bff2522d352228f398e94c528a2f1628db7365de5ac147"

RPROVIDES:${PN} += "umbrello \
umbrello5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5TextEditor.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libxml2.so.2 \
libxslt.so.1"

inherit rpm
