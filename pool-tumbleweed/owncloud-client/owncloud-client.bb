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

PV = "3.2.0"

RPM_NAME = "owncloud-client-3.2.0-2.3.aarch64.rpm"
RPM_HASH = "498fdda4a8bb9c340018918a3b89e098601e58c2cdc38c417d549eca82dab16adec9ac94472d52f1c028105fe1e9530a47aab07780770f58fce357f4e85204c0"

RPROVIDES:${PN} += "application() \
application(owncloud.desktop) \
config(owncloud-client) \
mimehandler(application/vnd.owncloud) \
owncloud-client \
owncloud-client(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libLibreGraphAPI.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcloudproviders.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libowncloudResources.so.0()(64bit) \
libowncloud_csync.so.0()(64bit) \
libowncloudsync.so.0()(64bit) \
libowncloudsync0 \
libqt5keychain.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
