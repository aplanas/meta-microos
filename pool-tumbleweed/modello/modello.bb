SUMMARY = "Modello Data Model toolkit"
DESCRIPTION = "Modello is a Data Model toolkit in use by the Apache Maven Project. \
 \
Modello is a framework for code generation from a simple model. \
Modello generates code from a simple model format based on a plugin \
architecture, various types of code and descriptors can be generated \
from the single model, including Java POJOs, XML \
marshallers/unmarshallers, XSD and documentation."
LICENSE = "Apache-2.0 & MIT"

PV = "2.1.2"

RPM_NAME = "modello-2.1.2-1.1.noarch.rpm"
RPM_HASH = "db80084108694db624a2c63486d3346d333488fc3d188c80f6cad8eba7a2183b338feacf00af832b2649b0c7a4e47be6d68a83f7f387a5bc3860503f05d9a19b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "modello \
mvn-org.codehaus.modello-modello-core \
mvn-org.codehaus.modello-modello-core-pom- \
mvn-org.codehaus.modello-modello-plugin-converters \
mvn-org.codehaus.modello-modello-plugin-converters-pom- \
mvn-org.codehaus.modello-modello-plugin-dom4j \
mvn-org.codehaus.modello-modello-plugin-dom4j-pom- \
mvn-org.codehaus.modello-modello-plugin-java \
mvn-org.codehaus.modello-modello-plugin-java-pom- \
mvn-org.codehaus.modello-modello-plugin-jdom \
mvn-org.codehaus.modello-modello-plugin-jdom-pom- \
mvn-org.codehaus.modello-modello-plugin-sax \
mvn-org.codehaus.modello-modello-plugin-sax-pom- \
mvn-org.codehaus.modello-modello-plugin-stax \
mvn-org.codehaus.modello-modello-plugin-stax-pom- \
mvn-org.codehaus.modello-modello-plugin-xdoc \
mvn-org.codehaus.modello-modello-plugin-xdoc-pom- \
mvn-org.codehaus.modello-modello-plugin-xml \
mvn-org.codehaus.modello-modello-plugin-xml-pom- \
mvn-org.codehaus.modello-modello-plugin-xpp3 \
mvn-org.codehaus.modello-modello-plugin-xpp3-pom- \
mvn-org.codehaus.modello-modello-plugin-xsd \
mvn-org.codehaus.modello-modello-plugin-xsd-pom-"

RDEPENDS:${PN} += "/usr/bin/bash \
guava \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-com.google.inject-guice \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.eclipse.sisu-org.eclipse.sisu.plexus \
mvn-org.jsoup-jsoup \
mvn-org.sonatype.plexus-plexus-build-api \
xbean"

inherit rpm
