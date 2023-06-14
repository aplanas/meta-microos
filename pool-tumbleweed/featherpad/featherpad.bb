SUMMARY = "Qt5-based plaintext editor"
DESCRIPTION = "FeatherPad is a Qt5-based plain-text editor. It is independent of any desktop environment and has: \
* Drag-and-drop support, including tab detachment and attachment; \
* X11 virtual desktop awareness (using tabs on current desktop but opening a new window on another); \
* An optional permanent search bar with a different search entry for each tab; \
* Instant highlighting of found matches when searching; \
* A docked window for text replacement; \
* Support for showing line numbers and jumping to a specific line; \
* Automatic detection of text encoding as far as possible and optional saving with encoding; \
* Syntax highlighting for common programming languages; \
* Printing; \
* Text zooming; \
* Non-interrupting prompts;"
LICENSE = "GPL-3.0-only"

PV = "1.4.0"

RPM_NAME = "featherpad-1.4.0-1.1.aarch64.rpm"
RPM_HASH = "7bcc4ec7d8c8066dda70e3c6bbfa85bb0f0c22c7ac4fdc87c3d33412bc6fae21ec00a21b82f5ae800de393e7b0e1a498e060dbb28bebce617c8159a01d5a8a7b"

RPROVIDES:${PN} += "featherpad"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libhunspell-1.7.so.0 \
libstdc++.so.6"

inherit rpm
