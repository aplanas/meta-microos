SUMMARY = "Non-ABI stable experimental API for the Qt5 PDF library"
DESCRIPTION = "This package provides private headers of libqt5-qtpdf that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.14"

RPM_NAME = "libqt5-qtpdf-private-headers-devel-5.15.14-1.4.noarch.rpm"
RPM_HASH = "c61bc6662dcff63ee0c30f6ba4cb8f1a476d5bf1f48fb35b71d21c073dec71b50cf7f061edb83c5b20406932055595745956ad82510cd24fb0d79e776ee8ea7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtpdf-private-headers-devel"

RDEPENDS:${PN} += "libqt5-qtbase-private-headers-devel \
libqt5-qtpdf-devel"

inherit rpm
