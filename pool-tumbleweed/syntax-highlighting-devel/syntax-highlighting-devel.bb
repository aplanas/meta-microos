SUMMARY = "Syntax highlighting engine and library"
DESCRIPTION = "This is a tier1/functional version of the Kate syntax highlighting engine. \
It's not tied to a particular output format or editor engine."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT & BSD-3-Clause & Artistic-1.0"

PV = "5.108.0"

RPM_NAME = "syntax-highlighting-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "e60480418ecf1494f5d0b44745608701b1c31f1cdcb6c9bbf4069f8c82e48afc8ad87266d000e7db03fd20dbddbb5aef650e6ecc815eb59ce0d0cda795e7fc34"

RPROVIDES:${PN} += "cmake-KF5SyntaxHighlighting \
syntax-highlighting-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
cmake-Qt5Gui \
extra-cmake-modules \
libKF5SyntaxHighlighting5"

inherit rpm
