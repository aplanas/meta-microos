SUMMARY = "KDE PIM Libraries: Mailbox functionality"
DESCRIPTION = "This package provides the mailbox functionality for KDE PIM applications"
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5Mbox5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "c78ae8087e5a6cdeb691ef7c6e35e7c5a8c6861284b3264b12e8afc14688de6d68f4adddabe292e08d8ddff115ee63e162c0422fc49c737b815c245c3440f465"

RPROVIDES:${PN} += "libKPim5Mbox.so.5 \
libKPim5Mbox5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKPim5Mime.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
