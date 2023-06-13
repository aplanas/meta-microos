SUMMARY = "Graphical Front-End for IRC"
DESCRIPTION = "IRC (Internet Relay Chat) client with an MDI interface; scripting, \
pop-up, alias, and event editor; DCC (SEND CHAT VOICE and RESUME); \
SOCKSV4 & V5 support; and more."
LICENSE = "GPL-2.0-or-later & (GPL-3.0-only | SUSE-LGPL-2.1-with-digia-exception-1.1)"

PV = "5.0.0"

RPM_NAME = "kvirc-5.0.0-5.6.aarch64.rpm"
RPM_HASH = "9fc7f0020480dfbb21813f460d3d87c9622717cfbff3ad97f598e69648cb364a70a5cfeee98175b9d970e0ec832b236b53f898332b7de97a086e31e79d60d70f"

RPROVIDES:${PN} += "application() \
application(kvirc.desktop) \
kvirc \
kvirc(aarch-64) \
libkviabout.so()(64bit) \
libkviaction.so()(64bit) \
libkviactioneditor.so()(64bit) \
libkviaddon.so()(64bit) \
libkvialiaseditor.so()(64bit) \
libkviavatar.so()(64bit) \
libkvichan.so()(64bit) \
libkvichannelsjoin.so()(64bit) \
libkviclasseditor.so()(64bit) \
libkvicodetester.so()(64bit) \
libkviconfig.so()(64bit) \
libkvicontext.so()(64bit) \
libkvidcc.so()(64bit) \
libkvidialog.so()(64bit) \
libkvieditor.so()(64bit) \
libkvieventeditor.so()(64bit) \
libkvifile.so()(64bit) \
libkvifiletransferwindow.so()(64bit) \
libkvifish.so()(64bit) \
libkvihelp.so()(64bit) \
libkvihttp.so()(64bit) \
libkviident.so()(64bit) \
libkviiograph.so()(64bit) \
libkvilamerizer.so()(64bit) \
libkvilanguage.so()(64bit) \
libkvilib.so.5()(64bit) \
libkvilinks.so()(64bit) \
libkvilist.so()(64bit) \
libkvilog.so()(64bit) \
libkvilogview.so()(64bit) \
libkvimask.so()(64bit) \
libkvimath.so()(64bit) \
libkvimediaplayer.so()(64bit) \
libkvimircimport.so()(64bit) \
libkvimy.so()(64bit) \
libkvinotifier.so()(64bit) \
libkviobjects.so()(64bit) \
libkvioptions.so()(64bit) \
libkvipackage.so()(64bit) \
libkviperl.so()(64bit) \
libkviperlcore.so()(64bit) \
libkvipopup.so()(64bit) \
libkvipopupeditor.so()(64bit) \
libkviproxydb.so()(64bit) \
libkvipython.so()(64bit) \
libkvipythoncore.so()(64bit) \
libkviraweditor.so()(64bit) \
libkviregchan.so()(64bit) \
libkvireguser.so()(64bit) \
libkvirijndael.so()(64bit) \
libkvirot13.so()(64bit) \
libkviserverdb.so()(64bit) \
libkvisetup.so()(64bit) \
libkvisharedfile.so()(64bit) \
libkvisharedfileswindow.so()(64bit) \
libkvisnd.so()(64bit) \
libkvisocketspy.so()(64bit) \
libkvispaste.so()(64bit) \
libkvispellchecker.so()(64bit) \
libkvistr.so()(64bit) \
libkvisystem.so()(64bit) \
libkviterm.so()(64bit) \
libkvitexticons.so()(64bit) \
libkvitheme.so()(64bit) \
libkvitip.so()(64bit) \
libkvitmphighlight.so()(64bit) \
libkvitoolbar.so()(64bit) \
libkvitoolbareditor.so()(64bit) \
libkvitorrent.so()(64bit) \
libkvitrayicon.so()(64bit) \
libkviupnp.so()(64bit) \
libkviurl.so()(64bit) \
libkviuserlist.so()(64bit) \
libkviwindow.so()(64bit) \
mimehandler(application/x-kva) \
mimehandler(application/x-kvt)"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Multimedia.so.5()(64bit) \
libQt5Multimedia.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libaudiofile.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libenchant-2.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libperl.so()(64bit) \
libphonon4qt5.so.4()(64bit) \
libpython3.10.so.1.0()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
perl"

inherit rpm
