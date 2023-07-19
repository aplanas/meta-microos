SUMMARY = "Plymouth core library"
DESCRIPTION = "This package contains the libply-splash-core library \
used by graphical Plymouth splashes."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "libply-splash-core5-22.02.122+94.4bd41a3-6.1.aarch64.rpm"
RPM_HASH = "5b1b26e825fc3427c8dc4c655d9cf97415c7f44cd3ce65291834af61310eb97b8df626cf11f52858ff03aea8bb8bd2ce53306ed5a127019816dc16b98d900c84"

RPROVIDES:${PN} += "libply-splash-core.so.5 \
libply-splash-core5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libply.so.5 \
libudev.so.1"

inherit rpm
