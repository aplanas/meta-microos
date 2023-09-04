SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5NewStuffCore5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "3a29b4bdab664cf065204f5f5824f0edb41ddf24b56b33de10e159091f6e8dfd28347736348a148c1abde3aa6d8eeb847b1375b2cc07556184c2307184034e2f"

RPROVIDES:${PN} += "libKF5NewStuffCore.so.5 \
libKF5NewStuffCore5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Attica.so.5 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5Package.so.5 \
libKF5Syndication.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
