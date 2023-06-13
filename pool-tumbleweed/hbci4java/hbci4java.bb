SUMMARY = "Java online banking client using the HBCI standard"
DESCRIPTION = "Fork of HBCI4Java that contains support for chipTAN, \
smsTAN, HHD, SEPA and other fixes/enhancements."
LICENSE = "LGPL-2.1-only"

PV = "3.1.64"

RPM_NAME = "hbci4java-3.1.64-1.3.aarch64.rpm"
RPM_HASH = "5deb0dd1356299300be91633f323d14e7cef853850d231c508947a008713cb8d57da6f3adf9b13d2d258c54ccb235f2037efc1cf58dcbd41baa39c8e8b4c9c6a"

RPROVIDES:${PN} += "hbci4java \
hbci4java(aarch-64) \
libhbci4java-card-linux.so()(64bit) \
mvn(com.github.hbci4j:hbci4j-core) \
mvn(com.github.hbci4j:hbci4j-core:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
mvn(javax.xml.bind:jaxb-api) \
mvn(org.glassfish.jaxb:jaxb-runtime)"

inherit rpm
