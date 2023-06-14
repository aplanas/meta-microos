SUMMARY = "The lunar-calendar libraries -- GTK+ 3 Module"
DESCRIPTION = "This package contains a GTK+ 3 module of lunar-calendar. Calendar applications \
base on GTK3 can display Chinese Lunar calendar by this module."
LICENSE = "GPL-2.0+"

PV = "3.0.0+git20191124.f91a880"

RPM_NAME = "lunar-calendar-gtk3-module-3.0.0+git20191124.f91a880-1.15.aarch64.rpm"
RPM_HASH = "7821277d673db92695adc6f3edbe9daead5aba18f450d76f4cab60c4da2e0ebd0580828e0c171b79e1b6c8162f373550913f42759cfe10ae6cddd7c800e2fe00"

RPROVIDES:${PN} += "config-lunar-calendar-gtk3-module \
liblunar-calendar-module.so \
locale-patterns-gnome-gnome-zh-CN;zh-SG;zh-TW;zh-HK \
locale-patterns-mate-mate-zh-CN;zh-SG;zh-TW;zh-HK \
locale-patterns-xfce-xfce-zh-CN;zh-SG;zh-TW;zh-HK \
lunar-calendar-gtk3-module"

RDEPENDS:${PN} += "libc.so.6 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
liblunar-calendar-3.0.so.1 \
lunar-calendar"

inherit rpm
