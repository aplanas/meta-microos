SUMMARY = "Stand-alone freedesktop.org system tray"
DESCRIPTION = "Stalonetray is a stand-alone freedesktop.org and KDE system tray (notification \
area) for X Window System/X11 (e.g. X.Org or XFree 86). It has full XEMBED \
support and minimal dependencies: an X11 lib only. Stalonetray works with \
virtually any EWMH-compliant window manager."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.5"

RPM_NAME = "stalonetray-0.8.5-1.1.aarch64.rpm"
RPM_HASH = "05390f6d273c20182746f4c8f69abb29db54d5308f09013fd9f0a22d342c5d5f9234292d1331ff02ba4f8902ce2c97325251710fba918f8c6e2888761c14ab90"

RPROVIDES:${PN} += "stalonetray"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXpm.so.4 \
libc.so.6"

inherit rpm
