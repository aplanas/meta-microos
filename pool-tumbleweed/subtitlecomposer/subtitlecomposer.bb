SUMMARY = "A text-based subtitle editor"
DESCRIPTION = "A text-based subtitles editor that supports basic operations. It supports \
SubRip (SRT), MicroDVD, SSA/ASS, MPlayer, TMPlayer and YouTube captions, and \
has speech Recognition using PocketSphinx."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.1"

RPM_NAME = "subtitlecomposer-0.7.1-6.2.aarch64.rpm"
RPM_HASH = "fb70b8e91868d52db2a2646a38aa639481ed752e4b39f1b962d4c4726f77954196689b4432f9cdff45955852ddc454e82a7efb69e3f63747c0741af50dff721a"

RPROVIDES:${PN} += "config-subtitlecomposer \
subtitlecomposer"

RDEPENDS:${PN} += "/usr/bin/ruby \
ld-linux-aarch64.so.1 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5KrossCore.so.5 \
libKF5SonnetCore.so.5 \
libKF5SonnetUi.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libicui18n.so.73 \
libm.so.6 \
libopenal.so.1 \
libpocketsphinx.so.3 \
libsphinxbase.so.3 \
libstdc++.so.6 \
libswresample.so.4 \
libswscale.so.7"

inherit rpm
