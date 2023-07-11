SUMMARY = "LeechCraft Azoth Juick.com service Module"
DESCRIPTION = "This package contains a plugin for LeechCraft Azoth which \
provides an enhanced experience with the juick.com microblogging service."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-juick-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "47363a5dbec99a598218d346856c7d450f318417ae349468afe59d80e6a85546d5b5cab36b77d9fcffbe2ee016861c5b437f628531d5b3c3b19577edf87d17a9"

RPROVIDES:${PN} += "leechcraft-azoth-juick \
libleechcraft-azoth-juick.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt5Core.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libstdc++.so.6"

inherit rpm
