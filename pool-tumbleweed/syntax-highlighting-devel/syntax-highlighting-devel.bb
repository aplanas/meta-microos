SUMMARY = "Syntax highlighting engine and library"
DESCRIPTION = "This is a tier1/functional version of the Kate syntax highlighting engine. \
It's not tied to a particular output format or editor engine."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT & BSD-3-Clause & Artistic-1.0"

PV = "5.109.0"

RPM_NAME = "syntax-highlighting-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "2f633d9534253d0e19e43956d9144d1b88ad0362e2dfa409acac0ce24093b1b5922039cb32cfe833e6a8fe1b4e8adbc26bfa3b34cdd2159f73d7b9b0fc33b6a8"

RPROVIDES:${PN} += "cmake-KF5SyntaxHighlighting \
syntax-highlighting-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
cmake-Qt5Gui \
extra-cmake-modules \
libKF5SyntaxHighlighting5"

inherit rpm
