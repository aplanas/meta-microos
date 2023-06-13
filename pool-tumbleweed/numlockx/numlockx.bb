SUMMARY = "Switch on/off or toggle numlock"
DESCRIPTION = "This little thingy allows you to start X with NumLock turned on ( which \
is a feature that a lot of people seem to miss and nobody really knew \
how to achieve this ). This code relies on X extensions called XTest \
and XKB, so you need to have at least one of these X extensions \
installed ( you most probably do ). \
 \
 \
 \
Authors: \
-------- \
    Lubos Lunak <l.lunak@kde.org> \
    XKB stuff by Oswald Buddenhagen <ossi@kde.org>"
LICENSE = "MIT"

PV = "1.2"

RPM_NAME = "numlockx-1.2-181.21.aarch64.rpm"
RPM_HASH = "0fcc21de0e5d11f2f3b09ce9dadb4f297e36c15b64bd7a5c5326f094dd2b2c1366e7ca6a5e98186208d0b086a79337ce9c8178906d093fd4953707f5981ea194"

RPROVIDES:${PN} += "numlockx \
numlockx(aarch-64) \
x11-tools:/usr/X11R6/bin/numlock"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXtst.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
