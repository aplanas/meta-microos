SUMMARY = "The Moon in focus"
DESCRIPTION = "One of the most important programs existing :-) Using this program, you \
can display all important information about the moon constantly. At \
last... \
 \
Hint: The option -c makes it also work with color ;-)"
LICENSE = "SUSE-Public-Domain"

PV = "22.9.94"

RPM_NAME = "xmoontool-22.9.94-977.25.aarch64.rpm"
RPM_HASH = "e38373c6b681e092b2778e5adcb910ebfa4629c3bd272c6ffc39dfa419d69df754bd1ca5cba8be76805482a2f2d3ad9c12cd5c1dd5b90c552c680fe3b1075e02"

RPROVIDES:${PN} += "application() \
application(xmoontool.desktop) \
moontool \
xmoontool \
xmoontool(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXm.so.4()(64bit) \
libXt.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
