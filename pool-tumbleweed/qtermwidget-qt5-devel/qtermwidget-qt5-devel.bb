SUMMARY = "QTermWidget devel package"
DESCRIPTION = "Development environment for qtermwidget library."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "qtermwidget-qt5-devel-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "756fcf8536f060173d4e7a3d59db1cadd1e39a982aa9cc8e89f52905809e7ea54160ab8f43e91b2fd5942e1fed707d09626dfd9c46ff71bfd39f80a8304322db"

RPROVIDES:${PN} += "cmake(qtermwidget5) \
pkgconfig(qtermwidget5) \
qtermwidget-qt5-devel \
qtermwidget-qt5-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqtermwidget5-1 \
pkgconfig(Qt5Widgets) \
pkgconfig(libutf8proc)"

inherit rpm
