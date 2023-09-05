SUMMARY = "Non-ABI stable experimental API for the Qt5 PDF library"
DESCRIPTION = "This package provides private headers of libqt5-qtpdf that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.15"

RPM_NAME = "libqt5-qtpdf-private-headers-devel-5.15.15-1.1.noarch.rpm"
RPM_HASH = "b26b0dde69e84f7461fabb68deef66da55a1af29057426a0610619b593ce6af8f42b6cc22eb64bdf19e2f40759ecce32ae78e16c4a0b5d76d63f695770e262ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtpdf-private-headers-devel"

RDEPENDS:${PN} += "libqt5-qtbase-private-headers-devel \
libqt5-qtpdf-devel"

inherit rpm
