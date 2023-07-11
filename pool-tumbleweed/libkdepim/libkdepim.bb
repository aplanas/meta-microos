SUMMARY = "Base package of kdepim"
DESCRIPTION = "This package contains the libkdepim library."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libkdepim-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "a00f51d5d8f85c100e0f778d18a5baca86cd63a0e48d65f916ce57fccff0abae734ed8eaf38f44e3e552d73c57644b27a5688bc82c8c0dce55371d2adc0fafef"

RPROVIDES:${PN} += "libkdepim"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKPim5Libkdepim.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
