SUMMARY = "Disk Usage Analyzer"
DESCRIPTION = "Disk Usage Analyzer is a graphical, menu-driven application to analyse \
disk usage in any GNOME environment. Disk Usage Analyzer can easily \
scan either the whole filesystem tree, or a specific user-requested \
directory branch (local or remote). \
 \
It also auto-detects in real-time any changes made to your home \
directory as far as any mounted/unmounted device. Disk Usage Analyzer \
also provides a full graphical treemap window for each selected folder."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "baobab-44.0-1.1.aarch64.rpm"
RPM_HASH = "cd33474a66b46714acf0ed4e8390ae329c5ea7760350a36cb81f2a5978432d164fdbb2c3932eb6dde1ecfc6d7be3180381b24b13096f98a2e5562268577f98b1"

RPROVIDES:${PN} += "baobab"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
