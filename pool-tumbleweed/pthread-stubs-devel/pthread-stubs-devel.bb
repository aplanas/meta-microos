SUMMARY = "The X Protocol"
DESCRIPTION = "The pthread-stubs for X development"
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "pthread-stubs-devel-0.5-1.1.aarch64.rpm"
RPM_HASH = "6a024cfdd8dcd189995b3cf81c7b3eec3655db7c84b2554323c91d51335827db3a8e293ae56525c02dbd47e8044ffc4da2ead5a17348c04c2248ed8815ba1762"

RPROVIDES:${PN} += "pkgconfig-pthread-stubs \
pthread-stubs-devel \
xorg-x11-proto-devel-//usr/lib64/pkgconfig/pthread-stubs.pc"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
