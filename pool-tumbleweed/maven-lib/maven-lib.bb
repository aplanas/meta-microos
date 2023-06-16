SUMMARY = "Core part of Maven"
DESCRIPTION = "Core part of Apache Maven that can be used as a library."
LICENSE = "Apache-2.0 & MIT"

PV = "3.9.1"

RPM_NAME = "maven-lib-3.9.1-2.1.aarch64.rpm"
RPM_HASH = "2c9a5efaeece24f00e92e92d7ec62e52093d1e5ea7874bb44ee659768d76b9bbc74255d3cb095abce157d0e858656de9bf32d86fadddb9e59f84d368c2093659"

RPROVIDES:${PN} += "bundled-slf4j \
config-maven-lib \
maven-lib \
mvn-org.apache.maven-maven-aether-provider \
mvn-org.apache.maven-maven-aether-provider-pom- \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-artifact-pom- \
mvn-org.apache.maven-maven-builder-support \
mvn-org.apache.maven-maven-builder-support-pom- \
mvn-org.apache.maven-maven-compat \
mvn-org.apache.maven-maven-compat-pom- \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-core-pom- \
mvn-org.apache.maven-maven-embedder \
mvn-org.apache.maven-maven-embedder-pom- \
mvn-org.apache.maven-maven-model \
mvn-org.apache.maven-maven-model-builder \
mvn-org.apache.maven-maven-model-builder-pom- \
mvn-org.apache.maven-maven-model-pom- \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven-maven-plugin-api-pom- \
mvn-org.apache.maven-maven-pom- \
mvn-org.apache.maven-maven-repository-metadata \
mvn-org.apache.maven-maven-repository-metadata-pom- \
mvn-org.apache.maven-maven-resolver-provider \
mvn-org.apache.maven-maven-resolver-provider-pom- \
mvn-org.apache.maven-maven-settings \
mvn-org.apache.maven-maven-settings-builder \
mvn-org.apache.maven-maven-settings-builder-pom- \
mvn-org.apache.maven-maven-settings-pom- \
mvn-org.apache.maven-maven-slf4j-provider \
mvn-org.apache.maven-maven-slf4j-provider-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
aopalliance \
apache-commons-cli \
apache-commons-codec \
apache-commons-lang3 \
apache-commons-logging \
atinject \
glassfish-annotation-api \
google-guice \
guava \
httpcomponents-client \
httpcomponents-core \
jansi \
java-headless \
javapackages-filesystem \
javapackages-tools \
jcl-over-slf4j \
junit \
maven-resolver-api \
maven-resolver-connector-basic \
maven-resolver-impl \
maven-resolver-named-locks \
maven-resolver-spi \
maven-resolver-transport-file \
maven-resolver-transport-http \
maven-resolver-transport-wagon \
maven-resolver-util \
maven-shared-utils \
maven-wagon-file \
maven-wagon-http \
maven-wagon-http-shared \
maven-wagon-provider-api \
mvn-com.google.guava-failureaccess \
mvn-com.google.guava-guava \
mvn-com.google.inject-guice \
mvn-commons-cli-commons-cli \
mvn-javax.annotation-javax.annotation-api \
mvn-javax.inject-javax.inject \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.maven.resolver-maven-resolver-api \
mvn-org.apache.maven.resolver-maven-resolver-impl \
mvn-org.apache.maven.resolver-maven-resolver-spi \
mvn-org.apache.maven.resolver-maven-resolver-util \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.apache.maven.wagon-wagon-provider-api \
mvn-org.codehaus.plexus-plexus-cipher \
mvn-org.codehaus.plexus-plexus-classworlds \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-interpolation \
mvn-org.codehaus.plexus-plexus-sec-dispatcher \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.eclipse.sisu-org.eclipse.sisu.inject \
mvn-org.eclipse.sisu-org.eclipse.sisu.plexus \
mvn-org.slf4j-slf4j-api \
objectweb-asm \
plexus-cipher \
plexus-classworlds \
plexus-containers-component-annotations \
plexus-interpolation \
plexus-sec-dispatcher \
plexus-utils \
sisu-inject \
sisu-plexus \
slf4j"

inherit rpm
