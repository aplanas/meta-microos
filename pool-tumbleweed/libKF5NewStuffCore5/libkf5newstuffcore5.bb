SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5NewStuffCore5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "da7cdb150e9fda9cf9147097f83263d63930e32c48849f15f5f199da42e7b982a6d9b7d8ef038c07abdd64baae8833e393bc9e2282b9fd66cfdb8d1acd56b162"

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
