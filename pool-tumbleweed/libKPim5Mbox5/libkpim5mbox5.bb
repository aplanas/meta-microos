SUMMARY = "KDE PIM Libraries: Mailbox functionality"
DESCRIPTION = "This package provides the mailbox functionality for KDE PIM applications"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5Mbox5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "c1b0747cbae64d630c1f3a6e938ca08c58bd5ae19d89a594976e869f5ba138ba69cc2868d194ca1ec23f1b87dc8f4bb949814f78a2c344dc60d4e9bbd694f9b6"

RPROVIDES:${PN} += "libKPim5Mbox.so.5 \
libKPim5Mbox5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKPim5Mime.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
