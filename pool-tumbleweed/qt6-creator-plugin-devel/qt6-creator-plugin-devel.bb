SUMMARY = "Qt Creator Plugin Development Files"
DESCRIPTION = "This package contains all files from the Qt Creator source directory \
(aka QTC_SOURCE) necessary to compile plugins."
LICENSE = "BSD-3-Clause & GPL-3.0-only & GPL-3.0-with-Qt-Company-Qt-exception-1.1 & (LGPL-2.1-only | LGPL-3.0-only) & LGPL-3.0-only"

PV = "11.0.0"

RPM_NAME = "qt6-creator-plugin-devel-11.0.0-1.2.aarch64.rpm"
RPM_HASH = "1faf497c2b4e2e2ecd9c4768350b59c228288c8f2bb4b7915b58370f8d87a5ec581e3f6bc73930861897cdb0d8a2845dbbda72298c76b582dc9cdb6afadaf5f4"

RPROVIDES:${PN} += "cmake-QtCreator \
libqt5-creator-plugin-devel \
qt5-creator-plugin-devel \
qt6-creator-plugin-devel"

RDEPENDS:${PN} += "qt6-base-devel \
qt6-creator"

inherit rpm
