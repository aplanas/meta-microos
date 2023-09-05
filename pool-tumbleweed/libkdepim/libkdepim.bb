SUMMARY = "Base package of kdepim"
DESCRIPTION = "This package contains the libkdepim library."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libkdepim-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "3311de3e6d51cab3ef8659d85d6852ab09da444ffe59d686a1cb536fcf08bb5d045e2082bdbe609fcf16e761eeb102fd371f8bec6b42fdef29e96f45edc656e5"

RPROVIDES:${PN} += "libkdepim"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKPim5Libkdepim.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
