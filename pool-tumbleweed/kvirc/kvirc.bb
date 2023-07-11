SUMMARY = "Graphical Front-End for IRC"
DESCRIPTION = "IRC (Internet Relay Chat) client with an MDI interface; scripting, \
pop-up, alias, and event editor; DCC (SEND CHAT VOICE and RESUME); \
SOCKSV4 & V5 support; and more."
LICENSE = "GPL-2.0-or-later & (GPL-3.0-only | SUSE-LGPL-2.1-with-digia-exception-1.1)"

PV = "5.0.0"

RPM_NAME = "kvirc-5.0.0-5.9.aarch64.rpm"
RPM_HASH = "bad6b4bef3ddecf30bc72e781f9ce8a928dd9b4ee98e92d04498c38fdffe328d0667aad0ba1edad946baeb82aca558980e64159a87c3c51f1ff47fe63717f1fc"

RPROVIDES:${PN} += "kvirc \
libkviabout.so \
libkviaction.so \
libkviactioneditor.so \
libkviaddon.so \
libkvialiaseditor.so \
libkviavatar.so \
libkvichan.so \
libkvichannelsjoin.so \
libkviclasseditor.so \
libkvicodetester.so \
libkviconfig.so \
libkvicontext.so \
libkvidcc.so \
libkvidialog.so \
libkvieditor.so \
libkvieventeditor.so \
libkvifile.so \
libkvifiletransferwindow.so \
libkvifish.so \
libkvihelp.so \
libkvihttp.so \
libkviident.so \
libkviiograph.so \
libkvilamerizer.so \
libkvilanguage.so \
libkvilib.so.5 \
libkvilinks.so \
libkvilist.so \
libkvilog.so \
libkvilogview.so \
libkvimask.so \
libkvimath.so \
libkvimediaplayer.so \
libkvimircimport.so \
libkvimy.so \
libkvinotifier.so \
libkviobjects.so \
libkvioptions.so \
libkvipackage.so \
libkviperl.so \
libkviperlcore.so \
libkvipopup.so \
libkvipopupeditor.so \
libkviproxydb.so \
libkvipython.so \
libkvipythoncore.so \
libkviraweditor.so \
libkviregchan.so \
libkvireguser.so \
libkvirijndael.so \
libkvirot13.so \
libkviserverdb.so \
libkvisetup.so \
libkvisharedfile.so \
libkvisharedfileswindow.so \
libkvisnd.so \
libkvisocketspy.so \
libkvispaste.so \
libkvispellchecker.so \
libkvistr.so \
libkvisystem.so \
libkviterm.so \
libkvitexticons.so \
libkvitheme.so \
libkvitip.so \
libkvitmphighlight.so \
libkvitoolbar.so \
libkvitoolbareditor.so \
libkvitorrent.so \
libkvitrayicon.so \
libkviupnp.so \
libkviurl.so \
libkviuserlist.so \
libkviwindow.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5Notifications.so.5 \
libKF5Service.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xml.so.5 \
libX11.so.6 \
libaudiofile.so.1 \
libc.so.6 \
libcrypto.so.3 \
libenchant-2.so.2 \
libgcc-s.so.1 \
libm.so.6 \
libperl.so \
libphonon4qt5.so.4 \
libpython3.11.so.1.0 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1 \
perl"

inherit rpm
