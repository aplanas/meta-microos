SUMMARY = "Java Security Services (JSS)"
DESCRIPTION = "Java Security Services (JSS) is a java native interface which provides a bridge \
for java-based applications to use native Network Security Services (NSS). \
This only works with gcj. Other JREs require that JCE providers be signed."
LICENSE = "GPL-2.0-only | MPL-1.1 | LGPL-2.1-only"

PV = "5.0.0"

RPM_NAME = "mozilla-jss-5.0.0-2.7.aarch64.rpm"
RPM_HASH = "3177e56b8e87e44b7646b3845f8aa8fc942fa857305385014f63eca0db2d47394907bdd0ea89782d7c2cff79c3cd9643621dff200479f98e7f8184c052798aab"

RPROVIDES:${PN} += "libjss.so \
mozilla-jss"

RDEPENDS:${PN} += "apache-commons-lang \
java-headless \
jpackage-utils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnspr4.so \
libnss3.so \
libplc4.so \
libplds4.so \
libsmime3.so \
libssl3.so \
mozilla-nss \
slf4j \
slf4j-jdk14"

inherit rpm
