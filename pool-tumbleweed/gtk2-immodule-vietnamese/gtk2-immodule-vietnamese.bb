SUMMARY = "Vietnamese input method for the GTK+ toolkit library v2"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method for Vietnamese."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "gtk2-immodule-vietnamese-2.24.33-4.3.aarch64.rpm"
RPM_HASH = "e94e9c7e792ab49b30778dadc8d791c58bb7111cf8e1ccb67ccebec6ba8164ccd0c5209887143d8f6c65ab01661d151caea6623279269eda6b12f38bbafc2ef7"

RPROVIDES:${PN} += "gtk2-immodule-vietnamese \
gtk2-immodule-vietnamese(aarch-64) \
locale(gtk2:vi)"

RDEPENDS:${PN} += "/bin/sh \
gtk2 \
gtk2-tools \
libc.so.6(GLIBC_2.17)(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit)"

inherit rpm
