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

RPROVIDES:${PN} += "application() application(org.gnome.baobab.desktop) baobab baobab(aarch-64) metainfo() metainfo(org.gnome.baobab.appdata.xml) mimehandler(inode/directory)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libadwaita-1.so.0()(64bit) libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-4.so.1()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libpango-1.0.so.0()(64bit)"

inherit rpm
