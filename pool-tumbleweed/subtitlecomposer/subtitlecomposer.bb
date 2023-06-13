SUMMARY = "A text-based subtitle editor"
DESCRIPTION = "A text-based subtitles editor that supports basic operations. It supports \
SubRip (SRT), MicroDVD, SSA/ASS, MPlayer, TMPlayer and YouTube captions, and \
has speech Recognition using PocketSphinx."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.1"

RPM_NAME = "subtitlecomposer-0.7.1-6.2.aarch64.rpm"
RPM_HASH = "fb70b8e91868d52db2a2646a38aa639481ed752e4b39f1b962d4c4726f77954196689b4432f9cdff45955852ddc454e82a7efb69e3f63747c0741af50dff721a"

RPROVIDES:${PN} += "application() \
application(org.kde.subtitlecomposer.desktop) \
config(subtitlecomposer) \
metainfo() \
metainfo(org.kde.subtitlecomposer.appdata.xml) \
mimehandler(application/x-matroska) \
mimehandler(application/x-subrip) \
mimehandler(application/x-vobsub) \
mimehandler(text/x-ass) \
mimehandler(text/x-microdvd) \
mimehandler(text/x-mplsub) \
mimehandler(text/x-mpsub) \
mimehandler(text/x-ssa) \
mimehandler(text/x-subviewer) \
mimehandler(text/x-tmplayer) \
mimehandler(text/x-tmplayer+) \
mimehandler(video/mp2t) \
mimehandler(video/mp4) \
mimehandler(video/x-matroska) \
subtitlecomposer \
subtitlecomposer(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/ruby \
ld-linux-aarch64.so.1()(64bit) \
libKF5Codecs.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5KrossCore.so.5()(64bit) \
libKF5SonnetCore.so.5()(64bit) \
libKF5SonnetUi.so.5()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libavcodec.so.60()(64bit) \
libavformat.so.60()(64bit) \
libavutil.so.58()(64bit) \
libc.so.6()(64bit) \
libicui18n.so.73()(64bit) \
libm.so.6()(64bit) \
libopenal.so.1()(64bit) \
libpocketsphinx.so.3()(64bit) \
libsphinxbase.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libswresample.so.4()(64bit) \
libswscale.so.7()(64bit)"

inherit rpm
