SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5GAPIBlogger5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "f9f96ac6100b925fb27a764b93224a0fcc52a5175e85f52839bfd4e8d3959978312b395a3399ba734f6d1ff6964d754c7e4167e005ac641f6dda38ffcd8a08b7"

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
