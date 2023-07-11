SUMMARY = "Component metadata from plexus-containers"
DESCRIPTION = "The Plexus project seeks to create end-to-end developer tools for \
writing applications. At the core is the container, which can be \
embedded or for a full scale application server. There are many \
reusable components for hibernate, form processing, jndi, i18n, \
velocity, etc. Plexus also includes an application server which \
is like a J2EE application server, without all the baggage."
LICENSE = "Apache-2.0 & MIT & xpp"

PV = "2.1.1"

RPM_NAME = "plexus-component-metadata-2.1.1-4.2.noarch.rpm"
RPM_HASH = "fb5a409846a9250787fc0949d8351b2c252fcc8dc6ca0cb3456efdff54d87ebdfff50b834515bb7597c5ca8c525cd4608746e9a6b27139b6c91b508101754344"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-component-metadata \
mvn-org.codehaus.plexus-plexus-component-metadata-pom- \
plexus-component-metadata"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.thoughtworks.qdox-qdox \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-container-default \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.jdom-jdom2 \
mvn-org.ow2.asm-asm"

inherit rpm
