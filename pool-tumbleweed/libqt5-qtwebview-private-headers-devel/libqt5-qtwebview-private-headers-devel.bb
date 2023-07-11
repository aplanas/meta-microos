SUMMARY = "Non-ABI stable experimental API for Qt5's Webview library"
DESCRIPTION = "This package provides private headers of libqt5-qtwebview that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtwebview-private-headers-devel-5.15.10+kde0-1.1.noarch.rpm"
RPM_HASH = "4b574a429e7a7c909069456f54e04cd420767fc5e03bcf835fce4ad74af759809925a75f4b05d0cb770e49817181bb3c47f3f38d20a37af2672f9d35bf8d42a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtwebview-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libqt5-qtwebview-devel"

inherit rpm
