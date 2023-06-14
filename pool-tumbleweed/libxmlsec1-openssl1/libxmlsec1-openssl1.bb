SUMMARY = "OpenSSL crypto plugin for XML Security Library"
DESCRIPTION = "OpenSSL plugin for XML Security Library provides OpenSSL based crypto services \
for the xmlsec library."
LICENSE = "MIT"

PV = "1.2.37"

RPM_NAME = "libxmlsec1-openssl1-1.2.37-2.2.aarch64.rpm"
RPM_HASH = "f2aa91a0e45aa9c44091ec73979c88f7e8a3575d69418a35356b862a2379cd00b533eb01267c227bf7322daf18aaa7db740ae2a0643376e3416de34df24bfafa"

RPROVIDES:${PN} += "libxmlsec1-openssl.so.1 \
libxmlsec1-openssl1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcrypto.so.3 \
libxml2.so.2 \
libxmlsec1-1 \
libxmlsec1.so.1"

inherit rpm
