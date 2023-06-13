SUMMARY = "Tools for developing, debugging, and managing applications that use NSS"
DESCRIPTION = "The NSS Security Tools allow developers to test, debug, and manage \
applications that use NSS."
LICENSE = "MPL-2.0"

PV = "3.89"

RPM_NAME = "mozilla-nss-tools-3.89-2.1.aarch64.rpm"
RPM_HASH = "1ff2357ca221bd12c68467a43daf99c6263f35ef935073fcac2642bc3d51fb968368c92e9f9049e393b13004d45aa7735a06ef741a590b5f2b1131551d5c06b1"

RPROVIDES:${PN} += "mozilla-nss-tools \
mozilla-nss-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit) \
libnssutil3.so()(64bit) \
libplc4.so()(64bit) \
libplds4.so()(64bit) \
libsmime3.so()(64bit) \
libssl3.so()(64bit) \
libz.so.1()(64bit) \
mozilla-nss"

inherit rpm
