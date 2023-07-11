SUMMARY = "Libraries and headers for adding NetworkManager support to applications"
DESCRIPTION = "This package contains various headers accessing some NetworkManager \
functionality from applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.42.8"

RPM_NAME = "NetworkManager-devel-1.42.8-1.1.aarch64.rpm"
RPM_HASH = "4819edd6fa2e076ff8fd2efd7b8d63d7a0e28ff7baf1d4cb9efdc4c0485f8f85123d316967e172d1b395a5fd686b4b52504009c679bc3b6e606bfc7e118f76d5"

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
