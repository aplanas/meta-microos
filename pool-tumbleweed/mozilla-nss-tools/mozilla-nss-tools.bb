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
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit) \
libnss3.so(NSS_3.10)(64bit) \
libnss3.so(NSS_3.11)(64bit) \
libnss3.so(NSS_3.11.7)(64bit) \
libnss3.so(NSS_3.12)(64bit) \
libnss3.so(NSS_3.12.1)(64bit) \
libnss3.so(NSS_3.12.3)(64bit) \
libnss3.so(NSS_3.12.6)(64bit) \
libnss3.so(NSS_3.12.9)(64bit) \
libnss3.so(NSS_3.13)(64bit) \
libnss3.so(NSS_3.14)(64bit) \
libnss3.so(NSS_3.14.1)(64bit) \
libnss3.so(NSS_3.15)(64bit) \
libnss3.so(NSS_3.16.1)(64bit) \
libnss3.so(NSS_3.16.2)(64bit) \
libnss3.so(NSS_3.18)(64bit) \
libnss3.so(NSS_3.2)(64bit) \
libnss3.so(NSS_3.21)(64bit) \
libnss3.so(NSS_3.3)(64bit) \
libnss3.so(NSS_3.30)(64bit) \
libnss3.so(NSS_3.31)(64bit) \
libnss3.so(NSS_3.33)(64bit) \
libnss3.so(NSS_3.34)(64bit) \
libnss3.so(NSS_3.39)(64bit) \
libnss3.so(NSS_3.4)(64bit) \
libnss3.so(NSS_3.5)(64bit) \
libnss3.so(NSS_3.6)(64bit) \
libnss3.so(NSS_3.7)(64bit) \
libnss3.so(NSS_3.8)(64bit) \
libnss3.so(NSS_3.9)(64bit) \
libnss3.so(NSS_3.9.2)(64bit) \
libnss3.so(NSS_3.9.3)(64bit) \
libnssutil3.so()(64bit) \
libnssutil3.so(NSSUTIL_3.12)(64bit) \
libnssutil3.so(NSSUTIL_3.12.7)(64bit) \
libnssutil3.so(NSSUTIL_3.15)(64bit) \
libnssutil3.so(NSSUTIL_3.24)(64bit) \
libplc4.so()(64bit) \
libplds4.so()(64bit) \
libsmime3.so()(64bit) \
libsmime3.so(NSS_3.10)(64bit) \
libsmime3.so(NSS_3.2)(64bit) \
libsmime3.so(NSS_3.3)(64bit) \
libsmime3.so(NSS_3.4)(64bit) \
libsmime3.so(NSS_3.6)(64bit) \
libsmime3.so(NSS_3.9.3)(64bit) \
libssl3.so()(64bit) \
libssl3.so(NSS_3.12.6)(64bit) \
libssl3.so(NSS_3.13.2)(64bit) \
libssl3.so(NSS_3.14)(64bit) \
libssl3.so(NSS_3.15)(64bit) \
libssl3.so(NSS_3.15.4)(64bit) \
libssl3.so(NSS_3.2)(64bit) \
libssl3.so(NSS_3.20)(64bit) \
libssl3.so(NSS_3.22)(64bit) \
libssl3.so(NSS_3.24)(64bit) \
libssl3.so(NSS_3.27)(64bit) \
libssl3.so(NSS_3.28)(64bit) \
libssl3.so(NSS_3.33)(64bit) \
libssl3.so(NSS_3.4)(64bit) \
libssl3.so(NSS_3.7.4)(64bit) \
libssl3.so(NSS_3.80)(64bit) \
libz.so.1()(64bit) \
mozilla-nss"

inherit rpm
