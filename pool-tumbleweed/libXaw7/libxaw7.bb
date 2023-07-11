SUMMARY = "The X Athena Widget Set"
DESCRIPTION = "The X Window System Athena widget set implements simple user \
interfaces based upon the X Toolkit Intrinsics (Xt) library."
LICENSE = "MIT"

PV = "1.0.15"

RPM_NAME = "libXaw7-1.0.15-1.4.aarch64.rpm"
RPM_HASH = "a80c45b1296f84adb3512b064dcb22c8f298ae9b47836edbfd3ccf5a2cb35f6bb3591c832422b13ce8b77afd65c3da05d89df0dea6d8a8913520c7e4c0343eb5"

RPROVIDES:${PN} += "libXaw.so.7 \
libXaw7 \
libXaw7.so.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXmu.so.6 \
libXpm.so.4 \
libXt.so.6 \
libc.so.6"

inherit rpm
