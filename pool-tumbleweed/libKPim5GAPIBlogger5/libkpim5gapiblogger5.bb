SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5GAPIBlogger5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "b23d594ce1d282a1231e265d853e2b67178d63101dc4b6b3c2e919ce25e38020ebefdfb04b00e5ffd18fef06b1f323395544326b1d9958248ab5e8ed902cf05f"

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
