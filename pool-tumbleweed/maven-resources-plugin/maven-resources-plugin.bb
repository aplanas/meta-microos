SUMMARY = "Maven Resources Plugin"
DESCRIPTION = "The Resources Plugin handles the copying of project resources \
to the output directory."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "maven-resources-plugin-3.2.0-3.7.noarch.rpm"
RPM_HASH = "298dd6086b93387c033e283f96a31d7c06d48cb053427654f8a5083e8855913a0afac1ed49d912b72b08a096cd490e10a1c0f4aba06a1ce71ab1609bad4971df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resources-plugin \
mvn(org.apache.maven.plugins:maven-resources-plugin) \
mvn(org.apache.maven.plugins:maven-resources-plugin:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(commons-io:commons-io) \
mvn(org.apache.commons:commons-lang3) \
mvn(org.apache.maven.shared:maven-filtering) \
mvn(org.apache.maven:maven-core) \
mvn(org.apache.maven:maven-model) \
mvn(org.apache.maven:maven-plugin-api) \
mvn(org.codehaus.plexus:plexus-component-annotations) \
mvn(org.codehaus.plexus:plexus-interpolation) \
mvn(org.eclipse.sisu:org.eclipse.sisu.plexus)"

inherit rpm
