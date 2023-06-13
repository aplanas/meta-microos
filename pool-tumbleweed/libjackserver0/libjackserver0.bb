SUMMARY = "Jack Audio Connection Kit Library"
DESCRIPTION = "This package contains the library to access JACK \
(Jack Audio ConnectionKit) server functions."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.22"

RPM_NAME = "libjackserver0-1.9.22-2.1.aarch64.rpm"
RPM_HASH = "25be8da3aa3431a27294aa82a392d43735ef042f6ebfbdf7a92825459bbc8c104e3dc1d7eb3569016f6d58be7adb6016129a08c3b3078a033d728f15c5453a02"

RPROVIDES:${PN} += "libjack0:/usr/lib64/libjackserver.so.0* \
libjackserver.so.0()(64bit) \
libjackserver0 \
libjackserver0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcelt0.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libopus.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
