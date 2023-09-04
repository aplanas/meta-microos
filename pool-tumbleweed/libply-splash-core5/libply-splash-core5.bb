SUMMARY = "Plymouth core library"
DESCRIPTION = "This package contains the libply-splash-core library \
used by graphical Plymouth splashes."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "libply-splash-core5-22.02.122+94.4bd41a3-9.1.aarch64.rpm"
RPM_HASH = "948a57c918c292a8a9c424d895cad9c52c2586ac4f956e89d5784d5e2310b721b896e8a2debb7c35228ac3a1fc15e2213f64109c44cb934ca512608d5f2ba4b8"

RPROVIDES:${PN} += "libply-splash-core.so.5 \
libply-splash-core5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libply.so.5 \
libudev.so.1"

inherit rpm
