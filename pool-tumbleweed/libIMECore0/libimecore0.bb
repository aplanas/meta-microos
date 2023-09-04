SUMMARY = "Core library for libime"
DESCRIPTION = "This package provides core library for libime."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.1"

RPM_NAME = "libIMECore0-1.1.1-1.1.aarch64.rpm"
RPM_HASH = "80d954235e1b8b3be36dd5ef4c8b974ad887f1ccd7deeedde6d111ebd298a422adeef98793668c616da286aa05fae773834db822a13369f94bd485a94c628e3a"

RPROVIDES:${PN} += "libIMECore.so.0 \
libIMECore0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFcitx5Utils.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libime-tools \
libm.so.6 \
libstdc++.so.6"

inherit rpm
