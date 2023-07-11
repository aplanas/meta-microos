SUMMARY = "Component metadata from plexus-containers"
DESCRIPTION = "Plexus contains end-to-end developer tools for writing applications. \
At the core is the container, which can be embedded or for an \
application server. There are many reusable components for hibernate, \
form processing, jndi, i18n, velocity, etc. Plexus also includes an \
application server which is like a J2EE application server."
LICENSE = "Apache-2.0 & MIT & xpp"

PV = "2.1.1"

RPM_NAME = "plexus-metadata-generator-2.1.1-4.2.noarch.rpm"
RPM_HASH = "15c5f2ea54237e49d0fa87bd6cf4066372a671d180fde19719109afeea5aa7e891cda7383579790f7fa3c8cf7e926f7be5e22789e106e0f0eb6edaf16997154d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-metadata-generator \
mvn-org.codehaus.plexus-plexus-metadata-generator-pom- \
plexus-metadata-generator"

RDEPENDS:${PN} += "/usr/bin/bash \
apache-commons-cli \
guava \
java-headless \
javapackages-filesystem \
jdom2 \
mvn-com.thoughtworks.qdox-qdox \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-container-default \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.jdom-jdom2 \
mvn-org.ow2.asm-asm \
objectweb-asm \
plexus-cli \
plexus-containers-component-annotations \
plexus-containers-container-default \
plexus-utils \
qdox \
xbean"

inherit rpm
