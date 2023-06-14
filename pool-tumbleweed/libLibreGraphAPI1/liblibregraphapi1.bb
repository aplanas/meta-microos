SUMMARY = "A client library for the LibreGraphAPI library"
DESCRIPTION = "Libregraphapi is a MS Graph API influenced API for cloud collaboration."
LICENSE = "Apache-2.0"

PV = "1.0.4"

RPM_NAME = "libLibreGraphAPI1-1.0.4-1.1.aarch64.rpm"
RPM_HASH = "513c4b112d5eae4f63602cf06186082c46e634e9991cdc8540da0182cb836d406513a916619bc9563d9fb68f51881d80bc96e723cf95fffeab8e7c9eabae70fb"

RPROVIDES:${PN} += "libLibreGraphAPI.so.1 \
libLibreGraphAPI1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
