SUMMARY = "Java Web Start implementation"
DESCRIPTION = "The IcedTea-Web project provides a Free Software web browser plugin running \
applets written in the Java programming language and an implementation of Java \
Web Start, originally based on the NetX project."
LICENSE = "GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.8.8"

RPM_NAME = "icedtea-web-1.8.8-1.11.aarch64.rpm"
RPM_HASH = "8d2fb4ca94392509b719d60bb81a0208134092071b890e68ca69aa4284036815348138d309a7655f3cd8bc7fea398febcccfc5c77eb1ff5b0b6d4e0759131add"

RPROVIDES:${PN} += "icedtea-web \
java-1-6-0-openjdk-plugin \
java-1-7-0-openjdk-plugin \
java-1-8-0-openjdk-plugin \
java-1-9-0-openjdk-plugin \
java-plugin"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
java \
rhino \
tagsoup \
update-alternatives"

inherit rpm
