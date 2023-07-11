SUMMARY = "Maven plugin for creating javadocs"
DESCRIPTION = "The Maven Javadoc Plugin is a plugin that uses the javadoc tool for \
generating javadocs for the specified project."
LICENSE = "Apache-2.0"

PV = "3.3.2"

RPM_NAME = "maven-javadoc-plugin-3.3.2-4.4.noarch.rpm"
RPM_HASH = "4c8e29cf145e7b68b384551c7003ca9f662746be17a8e71b9cf62058a90f1da1ae83cc6962c1ea5f2bcbfceb4e54e332865c35b9c28c0a15b5a1ad276b39349e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-javadoc-plugin \
mvn-org.apache.maven.plugins-maven-javadoc-plugin \
mvn-org.apache.maven.plugins-maven-javadoc-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.thoughtworks.qdox-qdox \
mvn-commons-io-commons-io \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.commons-commons-text \
mvn-org.apache.httpcomponents-httpclient \
mvn-org.apache.httpcomponents-httpcore \
mvn-org.apache.maven-maven-archiver \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-model \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven-maven-settings \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.apache.maven.doxia-doxia-site-renderer \
mvn-org.apache.maven.reporting-maven-reporting-api \
mvn-org.apache.maven.shared-maven-artifact-transfer \
mvn-org.apache.maven.shared-maven-common-artifact-filters \
mvn-org.apache.maven.shared-maven-invoker \
mvn-org.apache.maven.wagon-wagon-provider-api \
mvn-org.codehaus.plexus-plexus-archiver \
mvn-org.codehaus.plexus-plexus-interactivity-api \
mvn-org.codehaus.plexus-plexus-io \
mvn-org.codehaus.plexus-plexus-java \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
