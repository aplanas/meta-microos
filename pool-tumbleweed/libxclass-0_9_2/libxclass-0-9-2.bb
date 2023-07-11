SUMMARY = "Library for Uniform Presentation of fvwm95 Programs"
DESCRIPTION = "This package contains a library for uniform presentation of fvwm95 \
programs."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.2"

RPM_NAME = "libxclass-0_9_2-0.9.2-188.7.aarch64.rpm"
RPM_HASH = "a87e4a83d4d4509891e173b57f3dd7fa6d0bd8ed828a6f1ad04b8aea3fecab6a49a5deb741f095075f66dd105b859f44d1f67f9866ea03bf05a9551fe362be2a"

RPROVIDES:${PN} += "libxclass-0-9-2 \
libxclass.so.0.9.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libXext.so.6 \
libXpm.so.4 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
xclass"

inherit rpm
