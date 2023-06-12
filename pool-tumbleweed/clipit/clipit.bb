SUMMARY = "A lightweight GTK+ clipboard manager"
DESCRIPTION = "ClipIt is a lightweight, fully featured GTK+ clipboard manager. \
It was forked from Parcellite, adding additional features and bugfixes to the project. \
 \
ClipIts main features are: \
 – Save a history of your last copied items; \
 – Search through the history; \
 – Global hotkeys for most used functions; \
 – Execute actions with clipboard items; \
 – Exclude specific items from history."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.2"

RPM_NAME = "clipit-1.4.2-3.15.aarch64.rpm"
RPM_HASH = "265b10439a3812a10c16d0835a0bc20323e73c934b6c211148d8a84f5ca83f3a832e296b2467c05358672b4233989e1ff3f5f12473d7ff3199a8e7307e5aedce"

RPROVIDES:${PN} += "application() \
application(clipit.desktop) \
clipit \
clipit(aarch-64) \
config(clipit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit)"

inherit rpm
