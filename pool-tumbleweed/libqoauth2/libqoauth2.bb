SUMMARY = "Library for interaction with OAuth-powered network services"
DESCRIPTION = "QOAuth supports interaction with OAuth-powered network services, \
in the style of Qt libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.0"

RPM_NAME = "libqoauth2-2.0.0-3.22.aarch64.rpm"
RPM_HASH = "d283d2d5883aad587e21a90aa10bc69c5342c936f94b6dbc153d5a063509d0868e639120dcbdcc4c2a4b1203fc1eac1e5a56ffefd62ba89c8afb2f712fea9710"

RPROVIDES:${PN} += "libqoauth.so.2 \
libqoauth2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libqca-qt5.so.2 \
libstdc++.so.6"

inherit rpm
