SUMMARY = "Java Security Services (JSS)"
DESCRIPTION = "Java Security Services (JSS) is a java native interface which provides a bridge \
for java-based applications to use native Network Security Services (NSS). \
This only works with gcj. Other JREs require that JCE providers be signed."
LICENSE = "GPL-2.0-only | MPL-1.1 | LGPL-2.1-only"

PV = "5.0.0"

RPM_NAME = "mozilla-jss-5.0.0-2.6.aarch64.rpm"
RPM_HASH = "22f1c3e3a27f51512a9eeb4075ea74b6aa103effd07d3b0bea6a1cdfc79839136f61a6e451330015a01837e5ae669689b3ca0e4a6e2e87968bd9c113f6c20447"

RPROVIDES:${PN} += "libjss.so()(64bit) \
mozilla-jss \
mozilla-jss(aarch-64)"

RDEPENDS:${PN} += "apache-commons-lang \
java-headless \
jpackage-utils \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit) \
libplc4.so()(64bit) \
libplds4.so()(64bit) \
libsmime3.so()(64bit) \
libssl3.so()(64bit) \
mozilla-nss \
slf4j \
slf4j-jdk14"

inherit rpm
