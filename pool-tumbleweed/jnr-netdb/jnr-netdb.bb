SUMMARY = "Network services database access for java"
DESCRIPTION = "jnr-netdb is a java interface to getservbyname(3), getservbyport(3). \
 \
It tries to use the native functions if possible, falling back to parsing \
/etc/services directly, and finally to an inbuilt table for use in environments \
where neither native code, nor filesystem access is possible."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "jnr-netdb-1.2.0-1.14.noarch.rpm"
RPM_HASH = "1b38d335b04a357e778795e3fcdc8b1aae4c9c0b22f4b796381a0a36669c64d0bc980f7d60b5410768217bd6be842dd20e1188da79688cee4061ea494d011f9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-netdb \
mvn-com.github.jnr-jnr-netdb \
mvn-com.github.jnr-jnr-netdb-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.github.jnr-jnr-ffi"

inherit rpm
