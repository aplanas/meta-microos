SUMMARY = "KDE PIM Libraries: Mailbox functionality"
DESCRIPTION = "This package provides the mailbox functionality for KDE PIM applications"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5Mbox5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "18fb8c749294fc4de09a4b7468f95c089f5384971435ac93e52d3ecb5ab0dbdf3e529ea82a0961c025b84e17790c4bc56e5b91be1f6051518866cb14961219c0"

RPROVIDES:${PN} += "libKPim5Mbox.so.5 \
libKPim5Mbox5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKPim5Mime.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
