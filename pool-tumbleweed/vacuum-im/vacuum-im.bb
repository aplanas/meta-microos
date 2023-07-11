SUMMARY = "Jabber client written with Qt"
DESCRIPTION = "The core program is just a plugin loader - all functionality is made \
available via plugins. This enforces modularity and ensures well defined \
component interaction via interfaces."
LICENSE = "GPL-3.0-only"

PV = "1.3.0+git1571036065.9f3952b2"

RPM_NAME = "vacuum-im-1.3.0+git1571036065.9f3952b2-1.21.aarch64.rpm"
RPM_HASH = "5ea4ecafdb0ca2692c5f615a2b26e63ea9c5460a7c356e8e68112b825548521f1256b33849b6151eb917fb0b42299157cf5d7455e3e027ad5e2275fc436d1a2d"

RPROVIDES:${PN} += "libaccountmanager.so \
libannotations.so \
libautostatus.so \
libavatars.so \
libbirthdayreminder.so \
libbitsofbinary.so \
libbookmarks.so \
libcaptchaforms.so \
libchatmessagehandler.so \
libchatstates.so \
libclientinfo.so \
libcommands.so \
libcompress.so \
libconnectionmanager.so \
libconsole.so \
libdataforms.so \
libdatastreamsmanager.so \
libdatastreamspublisher.so \
libdefaultconnection.so \
libemoticons.so \
libfilemessagearchive.so \
libfilestreamsmanager.so \
libfiletransfer.so \
libgateways.so \
libinbandstreams.so \
libiqauth.so \
libjabbersearch.so \
libmainwindow.so \
libmessagearchiver.so \
libmessagecarbons.so \
libmessageprocessor.so \
libmessagestyles.so \
libmessagewidgets.so \
libmetacontacts.so \
libmultiuserchat.so \
libnormalmessagehandler.so \
libnotifications.so \
liboptionsmanager.so \
libpepmanager.so \
libpresence.so \
libprivacylists.so \
libprivatestorage.so \
librecentcontacts.so \
libregistration.so \
libremotecontrol.so \
libroster.so \
librosterchanger.so \
librosteritemexchange.so \
librostersearch.so \
librostersmodel.so \
librostersview.so \
libsaslauth.so \
libservermessagearchive.so \
libservicediscovery.so \
libsessionnegotiation.so \
libshortcutmanager.so \
libsimplemessagestyle.so \
libsocksstreams.so \
libstanzaprocessor.so \
libstarttls.so \
libstatuschanger.so \
libstatusicons.so \
libtraymanager.so \
liburlprocessor.so \
libvcard.so \
libxmppstreams.so \
libxmppuriqueries.so \
vacuum-im"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libvacuumutils.so.37 \
libz.so.1"

inherit rpm
