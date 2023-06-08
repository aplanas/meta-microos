SUMMARY = "Concurrency JSR-166 - Collections supporting parallel operations"
DESCRIPTION = "Implementation of Java collections supporting parallel operations using \
Fork-Join concurrent framework provided by JSR-166."
LICENSE = "SUSE-Public-Domain"

PV = "1.7.0"

RPM_NAME = "extra166y-1.7.0-3.9.noarch.rpm"
RPM_HASH = "58f95e5a5c6b206fecf70d93e9dd4b957eb69a35928b286391616438e09012078aaa894208f25cbededfb8c2a68069e3fac6373ed1e80a4328b16bca2da0d9d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "extra166y mvn(org.codehaus.jsr166-mirror:extra166y) mvn(org.codehaus.jsr166-mirror:extra166y:pom:) osgi(extra166y)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
