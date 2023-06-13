SUMMARY = "SLF4J JCL Binding"
DESCRIPTION = "SLF4J JCL Binding."
LICENSE = "Apache-2.0 & MIT"

PV = "1.7.36"

RPM_NAME = "slf4j-jcl-1.7.36-4.1.noarch.rpm"
RPM_HASH = "4fc1d8734b0d420840097f23fb8fdbe28bb2e8197fb0d481a36059842347a3b632cb890d65d3fc8e1d25e16853340eed6c9a68d8b46d5877997a9ed5ddf0ab52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.slf4j:slf4j-jcl) \
mvn(org.slf4j:slf4j-jcl:pom:) \
osgi(slf4j.jcl) \
slf4j-jcl"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(commons-logging:commons-logging) \
mvn(org.slf4j:slf4j-api) \
osgi(slf4j.api)"

inherit rpm
