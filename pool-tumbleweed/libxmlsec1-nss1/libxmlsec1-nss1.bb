SUMMARY = "NSS crypto plugin for XML Security Library"
DESCRIPTION = "NSS plugin for XML Security Library provides NSS based crypto services \
for the xmlsec library."
LICENSE = "MIT"

PV = "1.2.37"

RPM_NAME = "libxmlsec1-nss1-1.2.37-3.1.aarch64.rpm"
RPM_HASH = "d84d7233a09b274dcc65ef55db8bedfe0879ed5d035c0100002f0d48ef0bc7f3c46caa7a34cb97e5d03870945cb2ada840cef24a0f511a7245cac78339dbfae1"

RPROVIDES:${PN} += "libxmlsec1-nss.so.1 \
libxmlsec1-nss1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libnspr4.so \
libnss3.so \
libsmime3.so \
libxml2.so.2 \
libxmlsec1-1 \
libxmlsec1.so.1"

inherit rpm
