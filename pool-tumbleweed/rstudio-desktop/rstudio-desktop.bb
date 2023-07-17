SUMMARY = "Integrated development environment for the R programming language"
DESCRIPTION = "RStudio is an integrated development environment (IDE) for the R programming \
language. Some of its features include: \
 \
- Customizable workbench with all of the tools required to work with R in one \
  place (console, source, plots, workspace, help, history, etc.). \
- Syntax highlighting editor with code completion. \
- Execute code directly from the source editor (line, selection, or file). \
- Full support for authoring Sweave and TeX documents."
LICENSE = "AGPL-3.0-only & Apache-2.0 & MPL-1.1 & LGPL-2.1-or-later & GPL-2.0-only & MIT & W3C-20150513 & BSD-3-Clause & (BSL-1.0 | MIT) & GPL-3.0-only & ISC & OFL-1.1 & Zlib & NPL-1.1 & CC-BY-4.0 & EPL-1.0"

PV = "2023.06.0+421"

RPM_NAME = "rstudio-desktop-2023.06.0+421-1.2.aarch64.rpm"
RPM_HASH = "34bb2cebeb1beb762de1bcc4598248c8b4491e6bbfd5f20e5e46b923376a00b3e5ef8cf5cda04555df85020e396cb31ac8e207693a00eb11f87dddb251f93b70"

RPROVIDES:${PN} += "rstudio-desktop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Quick.so.5 \
libQt5WebChannel.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libboost-chrono.so.1.82.0 \
libboost-filesystem.so.1.82.0 \
libboost-iostreams.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libcrypto.so.3 \
libfmt.so.9 \
libgcc-s.so.1 \
libstdc++.so.6 \
libuuid.so.1 \
rstudio"

inherit rpm
