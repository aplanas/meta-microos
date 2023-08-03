SUMMARY = "Non-ABI stable experimental API for the Qt5 PDF library"
DESCRIPTION = "This package provides private headers of libqt5-qtpdf that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.14"

RPM_NAME = "libqt5-qtpdf-private-headers-devel-5.15.14-2.1.noarch.rpm"
RPM_HASH = "5478ec42eef3719a0d32de6a372d6b68fcd660f72ba3506c66f2eedf738e99e1e38fe66512a9b37d4f4aed5b07d89a69a6efe24b8f38837edfe658499ba30284"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtpdf-private-headers-devel"

RDEPENDS:${PN} += "libqt5-qtbase-private-headers-devel \
libqt5-qtpdf-devel"

inherit rpm
