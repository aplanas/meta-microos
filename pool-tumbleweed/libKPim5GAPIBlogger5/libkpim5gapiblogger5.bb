SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5GAPIBlogger5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "11656fa23c0bb340eb7e0293068969fcb05cc9bb77e55862d5ffa0b6f729a805f8861172b76c659beff9c16c14b55c7ff78c4a08cde37d90ae5abe9d1b8965dd"

RPROVIDES:${PN} += "libKPim5GAPIBlogger.so.5 \
libKPim5GAPIBlogger5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKPim5GAPICore.so.5 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
