SUMMARY = "Java online banking client using the HBCI standard"
DESCRIPTION = "Fork of HBCI4Java that contains support for chipTAN, \
smsTAN, HHD, SEPA and other fixes/enhancements."
LICENSE = "LGPL-2.1-only"

PV = "3.1.64"

RPM_NAME = "hbci4java-3.1.64-1.4.aarch64.rpm"
RPM_HASH = "efcff4a6ddcdedddb42422dbe3ba110b620da4117aedc7afd920aa4895663c7078408c87124561d337169d256d293c96593f5ef54b6f18948a403f5bc8042ba4"

RPROVIDES:${PN} += "hbci4java \
libhbci4java-card-linux.so \
mvn-com.github.hbci4j-hbci4j-core \
mvn-com.github.hbci4j-hbci4j-core-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
libc.so.6 \
libstdc++.so.6 \
mvn-javax.xml.bind-jaxb-api \
mvn-org.glassfish.jaxb-jaxb-runtime"

inherit rpm
