SUMMARY = "Default Container from plexus-containers"
DESCRIPTION = "Default Container from plexus-containers."
LICENSE = "Apache-2.0 & MIT & xpp"

PV = "2.1.1"

RPM_NAME = "plexus-containers-container-default-2.1.1-4.1.noarch.rpm"
RPM_HASH = "fa9080f5df0570aa54fb76ce09e0d2975acadc92b75b4dded8944635beb2410cd3891c975c20160ead86504eb65633068f227e456e80e22b012ce696eb3f01ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.codehaus.plexus:containers-component-api) \
mvn(org.codehaus.plexus:containers-component-api:pom:) \
mvn(org.codehaus.plexus:plexus-container-default) \
mvn(org.codehaus.plexus:plexus-container-default:pom:) \
plexus-containers-container-default"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.google.guava:guava) \
mvn(junit:junit) \
mvn(org.apache.xbean:xbean-reflect) \
mvn(org.codehaus.plexus:plexus-classworlds) \
mvn(org.codehaus.plexus:plexus-utils) \
mvn(org.ow2.asm:asm) \
mvn(org.ow2.asm:asm-commons)"

inherit rpm
