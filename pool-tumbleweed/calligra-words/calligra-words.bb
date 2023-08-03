SUMMARY = "Word Processor"
DESCRIPTION = "Words is the word processor application of the Calligra Suite."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-words-3.2.1-7.21.aarch64.rpm"
RPM_HASH = "470c4dfa2cf61a50ed0cb89140eab7d780bbb22301d7cc5cfb448ec92af5ec9a88bd87bf442620c71be406f11df6a2d7f5971476681852ee9dbdb8244d19f7c6"

RPROVIDES:${PN} += "calligra-words \
calligra-words-common \
libRtfReader.so.17 \
libkdeinit5-calligrawords.so \
libkowv2.so.9 \
libwordsprivate.so.17"

RDEPENDS:${PN} += "/sbin/ldconfig \
calligra \
ld-linux-aarch64.so.1 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libflake.so.17 \
libgcc-s.so.1 \
libkomain.so.17 \
libkomsooxml.so.17 \
libkoodf.so.17 \
libkoodf2.so.17 \
libkoodfreader.so.17 \
libkostore.so.17 \
libkotext.so.17 \
libkotextlayout.so.17 \
libkovectorimage.so.17 \
libkoversion.so.17 \
libkowidgets.so.17 \
libkowidgetutils.so.17 \
libkundo2.so.17 \
libm.so.6 \
libodfgen-0.1.so.1 \
librevenge-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libstdc++.so.6 \
libwpd-0.10.so.10 \
libwpg-0.3.so.3 \
libwps-0.4.so.4 \
libz.so.1"

inherit rpm
