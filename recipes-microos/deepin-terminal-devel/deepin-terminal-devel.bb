SUMMARY = "Development tools for deepin-terminal"
DESCRIPTION = "The deepin-terminal-devel package contains the header files and developer \
docs for deepin-terminal."
LICENSE = "GPL-3.0-only"

PV = "5.4.33"

RPM_NAME = "deepin-terminal-devel-5.4.33-1.7.aarch64.rpm"
RPM_HASH = "bc0b316d2a89de0a7c3fab58e4da1d0cd5a4f6ad4c06def3c197a7b55403287fd2423998fa08034abc111aad09eaabef6e2025e5cd107bca03ba10466da40a53"

RPROVIDES:${PN} += "deepin-terminal-devel deepin-terminal-devel(aarch-64) pkgconfig(terminalwidget5)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libterminalwidget5-0 pkgconfig(Qt5Widgets)"

inherit rpm
