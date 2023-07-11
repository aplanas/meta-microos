SUMMARY = "Maven Plugin Tool for Beanshell"
DESCRIPTION = "Descriptor extractor for plugins written in Beanshell."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-tools-beanshell-3.6.0-5.2.noarch.rpm"
RPM_HASH = "498a09c5c306bd5b054f09278f9f0e397381649a847ef40a0e6193e60302d7e2d0d11214210ba15ed59fd306c103089937d93ed64d271144d31eee713fbc0bed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-tools-beanshell \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-beanshell \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-beanshell-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-api \
mvn-org.beanshell-bsh \
mvn-org.codehaus.plexus-plexus-component-annotations"

inherit rpm
