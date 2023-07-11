SUMMARY = "Qt 5 Wayland Addon Non-ABI stable experimental API files"
DESCRIPTION = "This package provides private headers of libqt5-qtwayland that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde51"

RPM_NAME = "libqt5-qtwayland-private-headers-devel-5.15.10+kde51-1.1.noarch.rpm"
RPM_HASH = "0001621a874692ff535c627efb7d54b3de687cba4c1233e654b045a9aa638232a399ddba4ba7b6addcf34329f51f9264771f3a6813b50f6d66fedb4157ae6fa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtwayland-private-headers-devel"

RDEPENDS:${PN} += "libqt5-qtbase-private-headers-devel \
libqt5-qtwayland-devel"

inherit rpm
