SUMMARY = "Lightweight Monitor Config Tool"
DESCRIPTION = "LXRandR is a lightweight Monitor Config Tool"
LICENSE = "GPL-2.0-only"

PV = "0.3.2"

RPM_NAME = "lxrandr-0.3.2-1.14.aarch64.rpm"
RPM_HASH = "bb3de0e939e70c9553e0f76741d52c416ccf028391d3b61b2a71d2c95870357542c899f2ccae5d854fc75b966295a537bbf1482fec8668e00f866578aa3877d6"

RPROVIDES:${PN} += "application() \
application(lxrandr.desktop) \
lxrandr \
lxrandr(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit)"

inherit rpm
