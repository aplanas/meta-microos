SUMMARY = "Tools for developing, debugging, and managing applications that use NSS"
DESCRIPTION = "The NSS Security Tools allow developers to test, debug, and manage \
applications that use NSS."
LICENSE = "MPL-2.0"

PV = "3.92"

RPM_NAME = "mozilla-nss-tools-3.92-1.1.aarch64.rpm"
RPM_HASH = "85faa2017a98d2b8abf500e3fed32ed6696acfabe274dcad5ea13a530aa53203c7f7c4926d31e9d1e610fcd6bb6ed2024bc3ea3f5a29e3e315c988e695b32b42"

RPROVIDES:${PN} += "mozilla-nss-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnspr4.so \
libnss3.so \
libnssutil3.so \
libplc4.so \
libplds4.so \
libsmime3.so \
libssl3.so \
libz.so.1 \
mozilla-nss"

inherit rpm
