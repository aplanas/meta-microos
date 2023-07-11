SUMMARY = "Libproxy module for KDE configuration"
DESCRIPTION = "A module to extend libproxy with capabilities to query KDE4 about proxy \
settings."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "libproxy1-config-kde-0.4.18-2.3.aarch64.rpm"
RPM_HASH = "b057372b5b6104bbd24fda9ce025eea4fb15094229dfae6da99fef45495b3ee7f583644e4ac93a02887de9a5a03aa6b628531a8fba123574c9044ff585676a82"

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
