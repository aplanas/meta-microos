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

PV = "2023.03.0+386"

RPM_NAME = "rstudio-desktop-2023.03.0+386-1.2.aarch64.rpm"
RPM_HASH = "ffbcb738e4e7b4ff15855f8a14efc5889b41ffd0f6115419c047463030daa1bdd9c60dcc8d737b965a8744d6f6de0db52b9aeb88688748f3168478b569332a96"

RPROVIDES:${PN} += "application() \
application(rstudio.desktop) \
mimehandler(application/x-r-data) \
mimehandler(application/x-r-project) \
mimehandler(application/x-rdp-rsp) \
mimehandler(text/css) \
mimehandler(text/javascript) \
mimehandler(text/x-R) \
mimehandler(text/x-c++hdr) \
mimehandler(text/x-c++src) \
mimehandler(text/x-chdr) \
mimehandler(text/x-csrc) \
mimehandler(text/x-markdown) \
mimehandler(text/x-quarto-markdown) \
mimehandler(text/x-r) \
mimehandler(text/x-r-doc) \
mimehandler(text/x-r-history) \
mimehandler(text/x-r-html) \
mimehandler(text/x-r-markdown) \
mimehandler(text/x-r-presentation) \
mimehandler(text/x-r-profile) \
mimehandler(text/x-r-source) \
mimehandler(text/x-r-sweave) \
mimehandler(text/x-tex) \
rstudio-desktop \
rstudio-desktop(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5WebChannel.so.5()(64bit) \
libQt5WebChannel.so.5(Qt_5)(64bit) \
libQt5WebEngineCore.so.5()(64bit) \
libQt5WebEngineCore.so.5(Qt_5)(64bit) \
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libboost_chrono.so.1.82.0()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libboost_iostreams.so.1.82.0()(64bit) \
libboost_thread.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libfmt.so.9()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libuuid.so.1()(64bit) \
rstudio"

inherit rpm
