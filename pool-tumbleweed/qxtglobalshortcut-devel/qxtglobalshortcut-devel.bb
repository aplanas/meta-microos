SUMMARY = "Development files for qxtglobalshortcut"
DESCRIPTION = "This package provides header files and documentation for developing \
applications using qxtglobalshortcut library."
LICENSE = "BSD-Source-Code"

PV = "0.0.1+git1533120914.688715b"

RPM_NAME = "qxtglobalshortcut-devel-0.0.1+git1533120914.688715b-1.24.aarch64.rpm"
RPM_HASH = "3f510a1a7d6e5e5eb637a2dffa900ff16468fd671840324a3fb4ae5ba39445aacffe07ad03df4b3aa8bba8260f2a54845e5cd27122c48f76a738bdc4b1557c3e"

RPROVIDES:${PN} += "cmake-qxtglobalshortcut \
pkgconfig-qxtglobalshortcut \
qxtglobalshortcut-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqxtglobalshortcut0 \
pkgconfig-Qt5Widgets"

inherit rpm
