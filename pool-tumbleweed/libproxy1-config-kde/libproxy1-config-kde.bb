SUMMARY = "Libproxy module for KDE configuration"
DESCRIPTION = "A module to extend libproxy with capabilities to query KDE4 about proxy \
settings."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "libproxy1-config-kde-0.4.18-2.1.aarch64.rpm"
RPM_HASH = "786f398f03d37745f7c714690f512b5eaacbfbeef1d12016845e1322331c091f20c725b5488dec49f6cedcae3ef6d1e53514d0ff86456b0f5e3dcb48df8190a3"

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
