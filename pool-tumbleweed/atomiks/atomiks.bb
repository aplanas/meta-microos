SUMMARY = "A faithful remake of, and a tribute to, Atomix, a classic puzzle game"
DESCRIPTION = "Atomiks is a faithful remake of, and a tribute to, Atomix, a classic puzzle game \
created by Softtouch & RoSt and published in 1990 by the Thalion Software company. \
Atomiks is free software, and shares no code with the original Atomix game."
LICENSE = "GPL-3.0+"

PV = "1.0.4.1"

RPM_NAME = "atomiks-1.0.4.1-1.26.aarch64.rpm"
RPM_HASH = "2e5854caef146a7b8f5b1cc636218e24e15e11846e68e17eb8bce6625f6e7b42cd07c421e98ba3e26e19bd19e524c9618904cc64e983bf43e87be1160bc6a59e"

RPROVIDES:${PN} += "application() \
application(atomiks.desktop) \
atomiks \
atomiks(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2_mixer-2.0.so.0()(64bit) \
libc.so.6()(64bit)"

inherit rpm
