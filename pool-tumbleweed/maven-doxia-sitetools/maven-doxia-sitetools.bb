SUMMARY = "Doxia content generation framework"
DESCRIPTION = "Doxia is a content generation framework which aims to provide its \
users with powerful techniques for generating static and dynamic \
content. Doxia can be used to generate static sites in addition to \
being incorporated into dynamic content generation systems like blogs, \
wikis and content management systems."
LICENSE = "Apache-2.0"

PV = "1.9.2"

RPM_NAME = "maven-doxia-sitetools-1.9.2-4.8.noarch.rpm"
RPM_HASH = "7564fd3056c4611440574a56f333c50a8bf2e7a2a6e50f8d6ee5f42a0dec97b6299c66fe6906239e7397fe3c35393cd74ccc591ee565c0c88728bdf7c94c1f6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-sitetools \
mvn(org.apache.maven.doxia:doxia-decoration-model) \
mvn(org.apache.maven.doxia:doxia-decoration-model:pom:) \
mvn(org.apache.maven.doxia:doxia-doc-renderer) \
mvn(org.apache.maven.doxia:doxia-doc-renderer:pom:) \
mvn(org.apache.maven.doxia:doxia-integration-tools) \
mvn(org.apache.maven.doxia:doxia-integration-tools:pom:) \
mvn(org.apache.maven.doxia:doxia-site-renderer) \
mvn(org.apache.maven.doxia:doxia-site-renderer:pom:) \
mvn(org.apache.maven.doxia:doxia-skin-model) \
mvn(org.apache.maven.doxia:doxia-skin-model:pom:) \
mvn(org.apache.maven.shared:maven-doxia-tools) \
mvn(org.apache.maven.shared:maven-doxia-tools:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(commons-collections:commons-collections) \
mvn(commons-io:commons-io) \
mvn(org.apache.commons:commons-lang3) \
mvn(org.apache.maven.doxia:doxia-core) \
mvn(org.apache.maven.doxia:doxia-logging-api) \
mvn(org.apache.maven.doxia:doxia-module-apt) \
mvn(org.apache.maven.doxia:doxia-module-fml) \
mvn(org.apache.maven.doxia:doxia-module-fo) \
mvn(org.apache.maven.doxia:doxia-module-xdoc) \
mvn(org.apache.maven.doxia:doxia-module-xhtml) \
mvn(org.apache.maven.doxia:doxia-module-xhtml5) \
mvn(org.apache.maven.doxia:doxia-sink-api) \
mvn(org.apache.maven.reporting:maven-reporting-api) \
mvn(org.apache.maven:maven-artifact) \
mvn(org.apache.maven:maven-artifact:2.2.1) \
mvn(org.apache.maven:maven-model) \
mvn(org.apache.maven:maven-plugin-api) \
mvn(org.apache.velocity:velocity) \
mvn(org.codehaus.plexus:plexus-component-annotations) \
mvn(org.codehaus.plexus:plexus-container-default) \
mvn(org.codehaus.plexus:plexus-i18n) \
mvn(org.codehaus.plexus:plexus-interpolation) \
mvn(org.codehaus.plexus:plexus-utils) \
mvn(org.codehaus.plexus:plexus-velocity) \
mvn(xalan:xalan) \
mvn(xml-apis:xml-apis)"

inherit rpm
