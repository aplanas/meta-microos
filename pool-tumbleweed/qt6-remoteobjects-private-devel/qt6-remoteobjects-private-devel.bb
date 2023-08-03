SUMMARY = "Non-ABI stable API for the Qt 6 RemoteObjects library"
DESCRIPTION = "This package provides private headers of libQt6RemoteObjects that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-remoteobjects-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "2f101430d2dd38d0e1751527c17873b1c12bb43f3dd750fdd3e6dc38f8ba8cfa548a6faadc56943b18c9317f669373c91892ff9bdacf56716c47d724049de250"

RPROVIDES:${PN} += "qt6-remoteobjects-private-devel"

RDEPENDS:${PN} += "cmake-Qt6RemoteObjects \
qt6-core-private-devel"

inherit rpm
