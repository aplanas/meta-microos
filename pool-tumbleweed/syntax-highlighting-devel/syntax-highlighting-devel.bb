SUMMARY = "Syntax highlighting engine and library"
DESCRIPTION = "This is a tier1/functional version of the Kate syntax highlighting engine. \
It's not tied to a particular output format or editor engine."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT & BSD-3-Clause & Artistic-1.0"

PV = "5.107.0"

RPM_NAME = "syntax-highlighting-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "b6118fef5b7aca3c9f5f4f3a39a35830b50902f417c3f69b5ce1b6d381904f2d50f13fc75e1355b031eacffd293de8d1f584870c48847dc48f769dccaf7bacf4"

RPROVIDES:${PN} += "cmake-KF5SyntaxHighlighting \
syntax-highlighting-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
cmake-Qt5Gui \
extra-cmake-modules \
libKF5SyntaxHighlighting5"

inherit rpm
