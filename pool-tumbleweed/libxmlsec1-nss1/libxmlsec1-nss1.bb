SUMMARY = "NSS crypto plugin for XML Security Library"
DESCRIPTION = "NSS plugin for XML Security Library provides NSS based crypto services \
for the xmlsec library."
LICENSE = "MIT"

PV = "1.2.37"

RPM_NAME = "libxmlsec1-nss1-1.2.37-2.3.aarch64.rpm"
RPM_HASH = "630c9a595765f328f140a30bafd78f680a49b0f7c8db4749d789900ba2af2d1a26b18760337edb42fa9f31279fe1a260f43623e187c4715a499852a787db35f3"

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
