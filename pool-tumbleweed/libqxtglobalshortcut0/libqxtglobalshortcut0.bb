SUMMARY = "Library for handling system-wide shortcuts in Qt applications"
DESCRIPTION = "Library for handling system-wide shortcuts in Qt applications."
LICENSE = "BSD-Source-Code"

PV = "0.0.1+git1533120914.688715b"

RPM_NAME = "libqxtglobalshortcut0-0.0.1+git1533120914.688715b-1.23.aarch64.rpm"
RPM_HASH = "caf229e6d92ea840d45131da1b68f0a8c517a348ebcc2bf643733035fa0dfa7111b3246461a64d33a814a83c70c1cdf4c755672aaea69ed3bbffa690f9aa635e"

RPROVIDES:${PN} += "libqxtglobalshortcut.so.0()(64bit) \
libqxtglobalshortcut0 \
libqxtglobalshortcut0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
