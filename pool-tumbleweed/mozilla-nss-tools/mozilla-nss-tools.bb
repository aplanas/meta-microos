SUMMARY = "Tools for developing, debugging, and managing applications that use NSS"
DESCRIPTION = "The NSS Security Tools allow developers to test, debug, and manage \
applications that use NSS."
LICENSE = "MPL-2.0"

PV = "3.91"

RPM_NAME = "mozilla-nss-tools-3.91-1.1.aarch64.rpm"
RPM_HASH = "70cba2e32de0e5897be27debb923314591aecd6afc26119cee29005bfd95c60cbdce9066162a6e50daea4aac17166197329d39ab263e18bbb587db43cf49ebc9"

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
