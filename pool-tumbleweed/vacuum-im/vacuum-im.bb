SUMMARY = "Jabber client written with Qt"
DESCRIPTION = "The core program is just a plugin loader - all functionality is made \
available via plugins. This enforces modularity and ensures well defined \
component interaction via interfaces."
LICENSE = "GPL-3.0-only"

PV = "1.3.0+git1571036065.9f3952b2"

RPM_NAME = "vacuum-im-1.3.0+git1571036065.9f3952b2-1.20.aarch64.rpm"
RPM_HASH = "4ff5c91eff41420fc9f7572333b8cee7e13482604043796c04673dbe8513bd08ed3781d8217ec52d4812f3af1eeb22b134e2c6fdc23899af159a6b7ac35dff93"

RPROVIDES:${PN} += "application() \
application(vacuum-im.desktop) \
libaccountmanager.so()(64bit) \
libannotations.so()(64bit) \
libautostatus.so()(64bit) \
libavatars.so()(64bit) \
libbirthdayreminder.so()(64bit) \
libbitsofbinary.so()(64bit) \
libbookmarks.so()(64bit) \
libcaptchaforms.so()(64bit) \
libchatmessagehandler.so()(64bit) \
libchatstates.so()(64bit) \
libclientinfo.so()(64bit) \
libcommands.so()(64bit) \
libcompress.so()(64bit) \
libconnectionmanager.so()(64bit) \
libconsole.so()(64bit) \
libdataforms.so()(64bit) \
libdatastreamsmanager.so()(64bit) \
libdatastreamspublisher.so()(64bit) \
libdefaultconnection.so()(64bit) \
libemoticons.so()(64bit) \
libfilemessagearchive.so()(64bit) \
libfilestreamsmanager.so()(64bit) \
libfiletransfer.so()(64bit) \
libgateways.so()(64bit) \
libinbandstreams.so()(64bit) \
libiqauth.so()(64bit) \
libjabbersearch.so()(64bit) \
libmainwindow.so()(64bit) \
libmessagearchiver.so()(64bit) \
libmessagecarbons.so()(64bit) \
libmessageprocessor.so()(64bit) \
libmessagestyles.so()(64bit) \
libmessagewidgets.so()(64bit) \
libmetacontacts.so()(64bit) \
libmultiuserchat.so()(64bit) \
libnormalmessagehandler.so()(64bit) \
libnotifications.so()(64bit) \
liboptionsmanager.so()(64bit) \
libpepmanager.so()(64bit) \
libpresence.so()(64bit) \
libprivacylists.so()(64bit) \
libprivatestorage.so()(64bit) \
librecentcontacts.so()(64bit) \
libregistration.so()(64bit) \
libremotecontrol.so()(64bit) \
libroster.so()(64bit) \
librosterchanger.so()(64bit) \
librosteritemexchange.so()(64bit) \
librostersearch.so()(64bit) \
librostersmodel.so()(64bit) \
librostersview.so()(64bit) \
libsaslauth.so()(64bit) \
libservermessagearchive.so()(64bit) \
libservicediscovery.so()(64bit) \
libsessionnegotiation.so()(64bit) \
libshortcutmanager.so()(64bit) \
libsimplemessagestyle.so()(64bit) \
libsocksstreams.so()(64bit) \
libstanzaprocessor.so()(64bit) \
libstarttls.so()(64bit) \
libstatuschanger.so()(64bit) \
libstatusicons.so()(64bit) \
libtraymanager.so()(64bit) \
liburlprocessor.so()(64bit) \
libvcard.so()(64bit) \
libxmppstreams.so()(64bit) \
libxmppuriqueries.so()(64bit) \
vacuum-im \
vacuum-im(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libvacuumutils.so.37()(64bit) \
libz.so.1()(64bit)"

inherit rpm
