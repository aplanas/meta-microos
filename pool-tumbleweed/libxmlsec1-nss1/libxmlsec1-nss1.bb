SUMMARY = "NSS crypto plugin for XML Security Library"
DESCRIPTION = "NSS plugin for XML Security Library provides NSS based crypto services \
for the xmlsec library."
LICENSE = "MIT"

PV = "1.2.37"

RPM_NAME = "libxmlsec1-nss1-1.2.37-2.2.aarch64.rpm"
RPM_HASH = "6f4f8b90e5288604591e868262824a35855fedda2e802ce0c4aee747eba79537dd6a54a76cae7dc5d8eaa8e7a4008ed3a247f90d07278529634a85c9def387aa"

RPROVIDES:${PN} += "libxmlsec1-nss.so.1()(64bit) \
libxmlsec1-nss1 \
libxmlsec1-nss1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit) \
libsmime3.so()(64bit) \
libxml2.so.2()(64bit) \
libxmlsec1-1 \
libxmlsec1.so.1()(64bit)"

inherit rpm
