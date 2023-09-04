SUMMARY = "Qt Creator Plugin Development Files"
DESCRIPTION = "This package contains all files from the Qt Creator source directory \
(aka QTC_SOURCE) necessary to compile plugins."
LICENSE = "BSD-3-Clause & GPL-3.0-only & GPL-3.0-with-Qt-Company-Qt-exception-1.1 & (LGPL-2.1-only | LGPL-3.0-only) & LGPL-3.0-only"

PV = "11.0.2"

RPM_NAME = "qt6-creator-plugin-devel-11.0.2-2.1.aarch64.rpm"
RPM_HASH = "dacce41d081d40c784a9571c13f5812c72ce7dcb0b852a57ca02cf86a2a9df141481303ade90388a58958669ec025cd5d40fff2b22420ab718e071ef70e61288"

RPROVIDES:${PN} += "cmake-QtCreator \
libqt5-creator-plugin-devel \
qt5-creator-plugin-devel \
qt6-creator-plugin-devel"

RDEPENDS:${PN} += "qt6-base-devel \
qt6-creator"

inherit rpm
