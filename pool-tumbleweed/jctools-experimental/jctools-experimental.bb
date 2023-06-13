SUMMARY = "JCTools Experimental implementations"
DESCRIPTION = "Experimental implementations for the \
Java Concurrency Tools Library."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "jctools-experimental-3.3.0-2.10.noarch.rpm"
RPM_HASH = "6fbb340ebba6e5c6f8b6aa4dfd144bcee333b3685b080c0e5483a5f3dd0b509959d3896269c24ddffdd7c16924fae5f016de582d19c790aae87495397b1814b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jctools-experimental \
mvn(org.jctools:jctools-experimental) \
mvn(org.jctools:jctools-experimental:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.jctools:jctools-channels) \
mvn(org.jctools:jctools-core) \
mvn(org.ow2.asm:asm-all)"

inherit rpm
