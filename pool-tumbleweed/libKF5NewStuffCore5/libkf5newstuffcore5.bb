SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5NewStuffCore5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "7d30b2ca7d298fa96bca709503fa56d79ed14e7b30e98eaf797a99ee5abd90d0d6103657f59081ae0b6c252af86ca8ab69949e200d35fa772194f1fd049b6cf1"

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
