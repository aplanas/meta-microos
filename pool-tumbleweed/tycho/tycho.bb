SUMMARY = "Plugins and extensions for building Eclipse plugins and OSGI bundles with Maven"
DESCRIPTION = "Tycho is a set of Maven plugins and extensions for building Eclipse \
plugins and OSGI bundles with Maven. Eclipse plugins and OSGI bundles \
have their own metadata for expressing dependencies, source folder \
locations, etc. that are normally found in a Maven POM. Tycho uses \
native metadata for Eclipse plugins and OSGi bundles and uses the POM \
to configure and drive the build. Tycho supports bundles, fragments, \
features, update site projects and RCP applications. Tycho also knows \
how to run JUnit test plugins using OSGi runtime and there is also \
support for sharing build results using Maven artifact repositories. \
 \
Tycho plugins introduce new packaging types and the corresponding \
lifecycle bindings that allow Maven to use OSGi and Eclipse metadata \
during a Maven build. OSGi rules are used to resolve project \
dependencies and package visibility restrictions are honored by the \
OSGi-aware JDT-based compiler plugin. Tycho will use OSGi metadata and \
OSGi rules to calculate project dependencies dynamically and injects \
them into the Maven project model at build time. Tycho supports all \
attributes supported by the Eclipse OSGi resolver (Require-Bundle, \
Import-Package, Eclipse-GenericRequire, etc). Tycho will use proper \
classpath access rules during compilation. Tycho supports all project \
types supported by PDE and will use PDE/JDT project metadata where \
possible. One important design goal in Tycho is to make sure there is \
no duplication of metadata between POM and OSGi metadata."
LICENSE = "Apache-2.0 & EPL-1.0"

PV = "1.6.0"

RPM_NAME = "tycho-1.6.0-6.6.noarch.rpm"
RPM_HASH = "7db709adb545f3e48a06d703c7e928225e52d08f54795f00fc9a51ed19cc8e84df42a7073eba1b97ad5758f34bd0790ce96ed2aaa3c4343ef419bd99eafcf3aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.eclipse.tycho-org.eclipse.tycho.core.shared \
mvn-org.eclipse.tycho-org.eclipse.tycho.embedder.shared \
mvn-org.eclipse.tycho-org.eclipse.tycho.noopsecurity \
mvn-org.eclipse.tycho-org.eclipse.tycho.p2.maven.repository \
mvn-org.eclipse.tycho-org.eclipse.tycho.p2.resolver.impl \
mvn-org.eclipse.tycho-org.eclipse.tycho.p2.resolver.shared \
mvn-org.eclipse.tycho-org.eclipse.tycho.p2.tools.impl \
mvn-org.eclipse.tycho-org.eclipse.tycho.p2.tools.shared \
mvn-org.eclipse.tycho-org.eclipse.tycho.surefire.junit \
mvn-org.eclipse.tycho-org.eclipse.tycho.surefire.junit-pom- \
mvn-org.eclipse.tycho-org.eclipse.tycho.surefire.junit4 \
mvn-org.eclipse.tycho-org.eclipse.tycho.surefire.junit4-pom- \
mvn-org.eclipse.tycho-org.eclipse.tycho.surefire.junit47 \
mvn-org.eclipse.tycho-org.eclipse.tycho.surefire.junit47-pom- \
mvn-org.eclipse.tycho-org.eclipse.tycho.surefire.junit5 \
mvn-org.eclipse.tycho-org.eclipse.tycho.surefire.junit5-pom- \
mvn-org.eclipse.tycho-org.eclipse.tycho.surefire.osgibooter \
mvn-org.eclipse.tycho-org.eclipse.tycho.surefire.testng \
mvn-org.eclipse.tycho-org.eclipse.tycho.surefire.testng-pom- \
mvn-org.eclipse.tycho-sisu-equinox-api \
mvn-org.eclipse.tycho-sisu-equinox-api-pom- \
mvn-org.eclipse.tycho-sisu-equinox-embedder \
mvn-org.eclipse.tycho-sisu-equinox-embedder-pom- \
mvn-org.eclipse.tycho-sisu-equinox-launching \
mvn-org.eclipse.tycho-sisu-equinox-launching-pom- \
mvn-org.eclipse.tycho-sisu-equinox-pom- \
mvn-org.eclipse.tycho-target-platform-configuration \
mvn-org.eclipse.tycho-target-platform-configuration-pom- \
mvn-org.eclipse.tycho-tycho-artifactcomparator \
mvn-org.eclipse.tycho-tycho-artifactcomparator-pom- \
mvn-org.eclipse.tycho-tycho-bundles-external-txt-manifest- \
mvn-org.eclipse.tycho-tycho-bundles-external-zip- \
mvn-org.eclipse.tycho-tycho-bundles-pom- \
mvn-org.eclipse.tycho-tycho-compiler-jdt \
mvn-org.eclipse.tycho-tycho-compiler-jdt-pom- \
mvn-org.eclipse.tycho-tycho-compiler-plugin \
mvn-org.eclipse.tycho-tycho-compiler-plugin-pom- \
mvn-org.eclipse.tycho-tycho-core \
mvn-org.eclipse.tycho-tycho-core-pom- \
mvn-org.eclipse.tycho-tycho-embedder-api \
mvn-org.eclipse.tycho-tycho-embedder-api-pom- \
mvn-org.eclipse.tycho-tycho-lib-detector \
mvn-org.eclipse.tycho-tycho-lib-detector-pom- \
mvn-org.eclipse.tycho-tycho-maven-plugin \
mvn-org.eclipse.tycho-tycho-maven-plugin-pom- \
mvn-org.eclipse.tycho-tycho-metadata-model \
mvn-org.eclipse.tycho-tycho-metadata-model-pom- \
mvn-org.eclipse.tycho-tycho-p2-director-plugin \
mvn-org.eclipse.tycho-tycho-p2-director-plugin-pom- \
mvn-org.eclipse.tycho-tycho-p2-facade \
mvn-org.eclipse.tycho-tycho-p2-facade-pom- \
mvn-org.eclipse.tycho-tycho-p2-plugin \
mvn-org.eclipse.tycho-tycho-p2-plugin-pom- \
mvn-org.eclipse.tycho-tycho-p2-pom- \
mvn-org.eclipse.tycho-tycho-p2-publisher-plugin \
mvn-org.eclipse.tycho-tycho-p2-publisher-plugin-pom- \
mvn-org.eclipse.tycho-tycho-p2-repository-plugin \
mvn-org.eclipse.tycho-tycho-p2-repository-plugin-pom- \
mvn-org.eclipse.tycho-tycho-packaging-plugin \
mvn-org.eclipse.tycho-tycho-packaging-plugin-pom- \
mvn-org.eclipse.tycho-tycho-pom- \
mvn-org.eclipse.tycho-tycho-pomgenerator-plugin \
mvn-org.eclipse.tycho-tycho-pomgenerator-plugin-pom- \
mvn-org.eclipse.tycho-tycho-release-pom- \
mvn-org.eclipse.tycho-tycho-source-plugin \
mvn-org.eclipse.tycho-tycho-source-plugin-pom- \
mvn-org.eclipse.tycho-tycho-standalone-p2-director-zip- \
mvn-org.eclipse.tycho-tycho-surefire-plugin \
mvn-org.eclipse.tycho-tycho-surefire-plugin-pom- \
mvn-org.eclipse.tycho-tycho-surefire-pom- \
mvn-org.eclipse.tycho-tycho-versions-plugin \
mvn-org.eclipse.tycho-tycho-versions-plugin-pom- \
mvn-org.eclipse.tycho.extras-target-platform-validation-plugin \
mvn-org.eclipse.tycho.extras-target-platform-validation-plugin-pom- \
mvn-org.eclipse.tycho.extras-tycho-custom-bundle-plugin \
mvn-org.eclipse.tycho.extras-tycho-custom-bundle-plugin-pom- \
mvn-org.eclipse.tycho.extras-tycho-dependency-tools-plugin \
mvn-org.eclipse.tycho.extras-tycho-dependency-tools-plugin-pom- \
mvn-org.eclipse.tycho.extras-tycho-document-bundle-plugin \
mvn-org.eclipse.tycho.extras-tycho-document-bundle-plugin-pom- \
mvn-org.eclipse.tycho.extras-tycho-eclipserun-plugin \
mvn-org.eclipse.tycho.extras-tycho-eclipserun-plugin-pom- \
mvn-org.eclipse.tycho.extras-tycho-extras-pom- \
mvn-org.eclipse.tycho.extras-tycho-p2-extras-plugin \
mvn-org.eclipse.tycho.extras-tycho-p2-extras-plugin-pom- \
mvn-org.eclipse.tycho.extras-tycho-pack200-impl \
mvn-org.eclipse.tycho.extras-tycho-pack200-impl-pom- \
mvn-org.eclipse.tycho.extras-tycho-pack200-its \
mvn-org.eclipse.tycho.extras-tycho-pack200-its-pom- \
mvn-org.eclipse.tycho.extras-tycho-pack200-pom- \
mvn-org.eclipse.tycho.extras-tycho-pack200a-plugin \
mvn-org.eclipse.tycho.extras-tycho-pack200a-plugin-pom- \
mvn-org.eclipse.tycho.extras-tycho-pack200b-plugin \
mvn-org.eclipse.tycho.extras-tycho-pack200b-plugin-pom- \
mvn-org.eclipse.tycho.extras-tycho-pomless \
mvn-org.eclipse.tycho.extras-tycho-pomless-pom- \
mvn-org.eclipse.tycho.extras-tycho-source-feature-plugin \
mvn-org.eclipse.tycho.extras-tycho-source-feature-plugin-pom- \
mvn-org.eclipse.tycho.extras-tycho-version-bump-plugin \
mvn-org.eclipse.tycho.extras-tycho-version-bump-plugin-pom- \
mvn-org.fedoraproject.p2-fedoraproject-p2-pom- \
mvn-org.fedoraproject.p2-org.fedoraproject.p2 \
mvn-org.fedoraproject.p2-org.fedoraproject.p2-pom- \
mvn-org.fedoraproject.p2-xmvn-p2-installer-plugin \
mvn-org.fedoraproject.p2-xmvn-p2-installer-plugin-pom- \
osgi-org.eclipse.tycho.core.shared \
osgi-org.eclipse.tycho.embedder-api \
osgi-org.eclipse.tycho.embedder.shared \
osgi-org.eclipse.tycho.noopsecurity \
osgi-org.eclipse.tycho.p2.maven.repository \
osgi-org.eclipse.tycho.p2.resolver.impl \
osgi-org.eclipse.tycho.p2.resolver.shared \
osgi-org.eclipse.tycho.p2.tools.impl \
osgi-org.eclipse.tycho.p2.tools.shared \
osgi-org.eclipse.tycho.sisu-equinox-api \
osgi-org.eclipse.tycho.sisu-equinox-launching \
osgi-org.eclipse.tycho.surefire.junit \
osgi-org.eclipse.tycho.surefire.junit4 \
osgi-org.eclipse.tycho.surefire.junit47 \
osgi-org.eclipse.tycho.surefire.junit5 \
osgi-org.eclipse.tycho.surefire.osgibooter \
osgi-org.eclipse.tycho.surefire.testng \
osgi-org.fedoraproject.p2 \
tycho \
tycho-extras"

RDEPENDS:${PN} += "/bin/sh \
ecj \
eclipse-platform \
java-headless \
javapackages-filesystem \
maven-clean-plugin \
maven-local \
mvn-de.pdark-decentxml \
mvn-io.takari.polyglot-polyglot-common \
mvn-org.apache.commons-commons-compress \
mvn-org.apache.commons-commons-exec \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.maven-maven-archiver \
mvn-org.apache.maven-maven-compat \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven.plugins-maven-source-plugin \
mvn-org.apache.maven.surefire-maven-surefire-common \
mvn-org.apache.maven.surefire-surefire-api \
mvn-org.codehaus.plexus-plexus-archiver \
mvn-org.codehaus.plexus-plexus-compiler-api \
mvn-org.codehaus.plexus-plexus-compiler-manager \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.eclipse.jdt-ecj \
mvn-org.fedoraproject.xmvn-xmvn-api \
mvn-org.fedoraproject.xmvn-xmvn-core \
mvn-org.ow2.asm-asm-tree \
mvn-org.ow2.asm-asm-util \
mvn-org.slf4j-slf4j-api \
mvn-org.slf4j-slf4j-simple \
xmvn-minimal"

inherit rpm
