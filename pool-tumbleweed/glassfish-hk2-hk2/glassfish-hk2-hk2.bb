SUMMARY = "HK2 module of HK2 itself"
DESCRIPTION = "This is so that other modules can depend on HK2 as an HK2 module."
LICENSE = "EPL-2.0 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-hk2-2.5.0-2.3.noarch.rpm"
RPM_HASH = "88308a8a9dc520f42a88bbc464cb2daf218540c2d6d0de52d7b8fb8087df24f4870326f45362467ebe5c5238a80ce3c9f3ee42a3a5664fd3556b1d6605193df9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-hk2 \
mvn(org.glassfish.hk2:hk2) \
mvn(org.glassfish.hk2:hk2:pom:) \
osgi(org.glassfish.hk2.hk2)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.glassfish.hk2:class-model) \
mvn(org.glassfish.hk2:hk2-api) \
mvn(org.glassfish.hk2:hk2-core) \
mvn(org.glassfish.hk2:hk2-locator) \
mvn(org.glassfish.hk2:hk2-runlevel) \
mvn(org.glassfish.hk2:hk2-utils)"

inherit rpm
