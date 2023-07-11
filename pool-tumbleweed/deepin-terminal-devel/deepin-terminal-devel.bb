SUMMARY = "Development tools for deepin-terminal"
DESCRIPTION = "The deepin-terminal-devel package contains the header files and developer \
docs for deepin-terminal."
LICENSE = "GPL-3.0-only"

PV = "5.4.33"

RPM_NAME = "deepin-terminal-devel-5.4.33-1.8.aarch64.rpm"
RPM_HASH = "d3daa4767736c814c26a53a44263d6058a4eb620f51f19f2d3a8ed1190a9eb7b7b774f362d61a6be969e0ab1f15fa9a125638d43f39c10076550456c3fd3762f"

RPROVIDES:${PN} += "deepin-terminal-devel \
pkgconfig-terminalwidget5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libterminalwidget5-0 \
pkgconfig-Qt5Widgets"

inherit rpm
