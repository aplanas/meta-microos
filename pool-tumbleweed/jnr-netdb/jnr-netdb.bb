SUMMARY = "Network services database access for java"
DESCRIPTION = "jnr-netdb is a java interface to getservbyname(3), getservbyport(3). \
 \
It tries to use the native functions if possible, falling back to parsing \
/etc/services directly, and finally to an inbuilt table for use in environments \
where neither native code, nor filesystem access is possible."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "jnr-netdb-1.2.0-1.13.noarch.rpm"
RPM_HASH = "e28deb18ef3979fed11a9895de8ee9500cf87acc2aacb107d123966ad7cc5fee28f684d5b82735c34d8025f58cde14fdb8adc55545f9ee874140cb50bbe71441"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-netdb \
mvn-com.github.jnr-jnr-netdb \
mvn-com.github.jnr-jnr-netdb-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.github.jnr-jnr-ffi"

inherit rpm
