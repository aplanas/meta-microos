SUMMARY = "Non-ABI stable experimental API for the Qt5 WebChannel library"
DESCRIPTION = "This package provides private headers of libqt5-qtwebchannel that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde3"

RPM_NAME = "libqt5-qtwebchannel-private-headers-devel-5.15.9+kde3-1.1.noarch.rpm"
RPM_HASH = "e16d6bfa1c47906345526afc439c89600975889ca534dade06242aaadb533edc3825938b255adfcdc8586a494969c04288ebfdf216ee846570b511125a48162a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtwebchannel-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libqt5-qtwebchannel-devel"

inherit rpm
