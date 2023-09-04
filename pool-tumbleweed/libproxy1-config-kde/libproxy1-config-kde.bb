SUMMARY = "Libproxy module for KDE configuration"
DESCRIPTION = "A module to extend libproxy with capabilities to query KDE4 about proxy \
settings."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "libproxy1-config-kde-0.4.18-2.4.aarch64.rpm"
RPM_HASH = "a84a202d7ea1f604a119453f52b178ee8c7836a7de25547be0267e20f5abbb7e8fd2fdff3dc12019cd2dca362ec7b1342b861d4417a1692cc33dfed4b7a1b3ec"

RPROVIDES:${PN} += "libproxy-kde \
libproxy1-config-kde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore5 \
libc.so.6 \
libgcc-s.so.1 \
libproxy.so.1 \
libproxy1 \
libqt5-qtpaths \
libstdc++.so.6"

inherit rpm
