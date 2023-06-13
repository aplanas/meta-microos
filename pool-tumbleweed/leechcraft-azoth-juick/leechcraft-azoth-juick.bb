SUMMARY = "LeechCraft Azoth Juick.com service Module"
DESCRIPTION = "This package contains a plugin for LeechCraft Azoth which \
provides an enhanced experience with the juick.com microblogging service."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-juick-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "1e43d6bdc156351827aad2564f0d3c770f170a10713645ed1f3813f4d79d7c6ffcb18be95f7c4d0fb7b7e106752ac7aa54a025fd0266898934b4eac12b3ae2d2"

RPROVIDES:${PN} += "leechcraft-azoth-juick \
leechcraft-azoth-juick(aarch-64) \
libleechcraft_azoth_juick.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
leechcraft-azoth \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libleechcraft-util-qt5.so.0.6.75()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
