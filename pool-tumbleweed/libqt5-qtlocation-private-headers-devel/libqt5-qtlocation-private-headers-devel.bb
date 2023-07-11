SUMMARY = "Non-ABI stable experimental API for the Qt5 Location Library"
DESCRIPTION = "This package provides private headers of libqt5-qtlocation that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde4"

RPM_NAME = "libqt5-qtlocation-private-headers-devel-5.15.10+kde4-1.1.noarch.rpm"
RPM_HASH = "d3cc95224f7863e7d9a9c96a753014b710bb24765665d7ea2e083b5a7a9851ab2b383e16ace03661eaf9f33dffe59d421b552e9952f612f23326a5754bd6a964"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtlocation-private-headers-devel"

RDEPENDS:${PN} += "libqt5-qtbase-private-headers-devel \
libqt5-qtdeclarative-private-headers-devel \
libqt5-qtlocation-devel"

inherit rpm
