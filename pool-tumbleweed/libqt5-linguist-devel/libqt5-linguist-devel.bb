SUMMARY = "Development files for the Qt 5 Linguist tools"
DESCRIPTION = "The Qt 5 Linguist Tools - development files."
LICENSE = "(LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "5.15.9+kde1"

RPM_NAME = "libqt5-linguist-devel-5.15.9+kde1-1.1.aarch64.rpm"
RPM_HASH = "8717b88aa4e208229a11e71b113b2efdb835f45f8d9a58734076c0b0a1cfcf0ebf9fcc30f5e74b2c241bed088b599fefdfe49978aab76607dfc3b505619cd0dd"

RPROVIDES:${PN} += "cmake-Qt5LinguistTools \
libqt5-linguist-devel"

RDEPENDS:${PN} += "libqt5-linguist \
pkgconfig-Qt5Core"

inherit rpm
