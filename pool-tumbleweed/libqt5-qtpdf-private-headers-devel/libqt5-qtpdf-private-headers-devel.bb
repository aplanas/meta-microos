SUMMARY = "Non-ABI stable experimental API for the Qt5 PDF library"
DESCRIPTION = "This package provides private headers of libqt5-qtpdf that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.14"

RPM_NAME = "libqt5-qtpdf-private-headers-devel-5.15.14-1.3.noarch.rpm"
RPM_HASH = "cb19e5ef2bd4054532a210f57366ff0fe97dc276f2e0b6c9c2c8604a80d1479744ffd3a5d7093846a4675219fe3fde5c72827a6f810119629ec91ce169a80108"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtpdf-private-headers-devel"

RDEPENDS:${PN} += "libqt5-qtbase-private-headers-devel \
libqt5-qtpdf-devel"

inherit rpm
