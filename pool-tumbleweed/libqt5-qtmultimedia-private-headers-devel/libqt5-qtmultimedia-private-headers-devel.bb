SUMMARY = "Non-ABI stable experimental API for the Qt5 Multimedia library"
DESCRIPTION = "This package provides private headers of libqt5-qtmultimedia that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde3"

RPM_NAME = "libqt5-qtmultimedia-private-headers-devel-5.15.10+kde3-1.1.noarch.rpm"
RPM_HASH = "01077f230a44357e921a4e9b768e2522d19aec9188a2947671141378abf99d521f7378bc7ee43a75853df0857873bac92dd52e9d8a80a787ec17f28b07a3bc46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Multimedia-private-headers-devel \
libqt5-qtmultimedia-private-headers-devel"

RDEPENDS:${PN} += "libQt5Gui-private-headers-devel \
libQt5Widgets-private-headers-devel \
libqt5-qtmultimedia-devel"

inherit rpm
