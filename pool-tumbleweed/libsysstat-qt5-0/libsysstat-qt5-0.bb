SUMMARY = "Library used to query system info and statistics"
DESCRIPTION = "Development libraries for libsysstat."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.6"

RPM_NAME = "libsysstat-qt5-0-0.4.6-1.9.aarch64.rpm"
RPM_HASH = "a948688b351b7b90ba39ebfeaba91a8226017ea8e218072c0f0ace56bb9b924f6025ee7c72a960788a6290811394481fba8ff54fc19c117b07b4af3cee0f645d"

RPROVIDES:${PN} += "libsysstat \
libsysstat-qt5-0 \
libsysstat-qt5.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
