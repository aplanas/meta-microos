SUMMARY = "Library for Terminal Handling"
DESCRIPTION = "This contain the developpment library for handling terminals \
of termrec."
LICENSE = "LGPL-2.0-or-later"

PV = "0.19"

RPM_NAME = "libtty-devel-0.19-1.14.aarch64.rpm"
RPM_HASH = "8b57373c2a370b855365587826c743270afbf547f7ce8f48a6ea7ec6fe6c1c4a9a46f99e9a405bacd06868eb47d0d7043cdf3c32ea21f5b8f3740b159def310e"

RPROVIDES:${PN} += "libtty-devel"

RDEPENDS:${PN} += "libtty1"

inherit rpm
