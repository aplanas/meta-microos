SUMMARY = "Modello Maven Plugin"
DESCRIPTION = "Modello is a Data Model toolkit in use by the Apache Maven Project. \
 \
Modello is a framework for code generation from a simple model. \
Modello generates code from a simple model format based on a plugin \
architecture, various types of code and descriptors can be generated \
from the single model, including Java POJOs, XML \
marshallers/unmarshallers, XSD and documentation. \
 \
Modello Maven Plugin enables the use of Modello in Maven builds."
LICENSE = "Apache-2.0 & MIT"

PV = "2.1.2"

RPM_NAME = "modello-maven-plugin-2.1.2-1.1.noarch.rpm"
RPM_HASH = "5c67f7e53569a15190c51c79febad07f7a74f6e65f8b99641ddefe0c23f52a3d15433e72fb5c52deb0be8ff76c61760e010b6581005e829851cc31467eb99f18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "modello-maven-plugin \
mvn-org.codehaus.modello-modello-maven-plugin \
mvn-org.codehaus.modello-modello-maven-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.modello-modello-core \
mvn-org.codehaus.modello-modello-plugin-converters \
mvn-org.codehaus.modello-modello-plugin-dom4j \
mvn-org.codehaus.modello-modello-plugin-java \
mvn-org.codehaus.modello-modello-plugin-jdom \
mvn-org.codehaus.modello-modello-plugin-sax \
mvn-org.codehaus.modello-modello-plugin-stax \
mvn-org.codehaus.modello-modello-plugin-xdoc \
mvn-org.codehaus.modello-modello-plugin-xpp3 \
mvn-org.codehaus.modello-modello-plugin-xsd \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.sonatype.plexus-plexus-build-api"

inherit rpm
