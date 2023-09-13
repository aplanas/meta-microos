SUMMARY = "The ownCloud synchronization client"
DESCRIPTION = "The ownCloud sync client - github.com/owncloud/client \
 \
ownCloud client enables you to connect to your private \
ownCloud Server. With it you can create folders in your home \
directory, and keep the contents of those folders synced with your \
ownCloud server. Simply copy a file into the directory and the \
ownCloud Client does the rest. \
 \
ownCloud gives you anytime and anywhere access to the files you \
need, whether through this desktop application, our mobile apps, \
the web interface, or other WebDAV clients. With it, you can \
easily view and share documents and information in a secure, \
flexible and controlled architecture. You can extend ownCloud \
with plug-ins from the community, or that you build yourself."
LICENSE = "GPL-2.0-only & GPL-3.0-only"

PV = "4.2.0"

RPM_NAME = "owncloud-client-4.2.0-1.1.aarch64.rpm"
RPM_HASH = "1f29c8bff70155f634aeb7fa6037655955e03670e21be7e07258dbd7c3fbf4b1b890849150a660f2ca516ed28365ef5db3cba9c8f81c4e1b7cef352344b7af4d"

RPROVIDES:${PN} += "config-owncloud-client \
owncloud-client"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLibreGraphAPI.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libcloudproviders.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libowncloud-csync.so.0 \
libowncloudResources.so.0 \
libowncloudsync.so.0 \
libowncloudsync0 \
libqt5keychain.so.1 \
libstdc++.so.6"

inherit rpm
