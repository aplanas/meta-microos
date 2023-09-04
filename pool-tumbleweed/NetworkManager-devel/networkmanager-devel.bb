SUMMARY = "Libraries and headers for adding NetworkManager support to applications"
DESCRIPTION = "This package contains various headers accessing some NetworkManager \
functionality from applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.44.0"

RPM_NAME = "NetworkManager-devel-1.44.0-1.1.aarch64.rpm"
RPM_HASH = "2058fba909bd321354270ac17fbc14af20f1ded3c33233bb998f028a3619a58b165bddc357eaf211fa383bfdd299f7a9b17e5633642c2dee536ca763e629225a"

RPROVIDES:${PN} += "NetworkManager-devel \
NetworkManager-doc \
pkgconfig-libnm \
rpm-macro--vpnservicedir"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
NetworkManager \
libnm0 \
pkgconfig-gio-2.0 \
typelib-1-0-NM-1-0"

inherit rpm
