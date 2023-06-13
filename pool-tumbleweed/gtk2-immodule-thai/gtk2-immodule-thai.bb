SUMMARY = "Thai-Lao input method for the GTK+ toolkit library v2"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method for Thai-Lao."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "gtk2-immodule-thai-2.24.33-4.3.aarch64.rpm"
RPM_HASH = "baf25faeb5bd240380b9f9c39905bd3b505e4788a03be98c096efc326806ba7b397c53d52be3aa3856bf712398843b9fe62f0c40dc17c62dd0b9ceb95ee42e56"

RPROVIDES:${PN} += "gtk2-immodule-thai \
gtk2-immodule-thai(aarch-64) \
locale(gtk2:lo) \
locale(gtk2:th)"

RDEPENDS:${PN} += "/bin/sh \
gtk2 \
gtk2-tools \
libc.so.6()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit)"

inherit rpm
