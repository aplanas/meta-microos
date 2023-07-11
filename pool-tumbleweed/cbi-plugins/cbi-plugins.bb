SUMMARY = "A set of helpers for Eclipse CBI"
DESCRIPTION = "A set of helpers for Eclipse CBI."
LICENSE = "EPL-1.0"

PV = "1.1.5"

RPM_NAME = "cbi-plugins-1.1.5-4.9.noarch.rpm"
RPM_HASH = "bd9e6f7e5ad1b49ea2d420c0639ff3a40eff95e13f7719926075ce3b5b3175a0d4166fa491319425a5c519c26c42a344930ed1c6765bb40e829f9b4096db3285"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cbi-plugins \
mvn-org.eclipse.cbi-cbi-common \
mvn-org.eclipse.cbi-cbi-common-pom- \
mvn-org.eclipse.cbi.maven.plugins-cbi-maven-plugin-common \
mvn-org.eclipse.cbi.maven.plugins-cbi-maven-plugin-common-pom- \
mvn-org.eclipse.cbi.maven.plugins-eclipse-cbi-plugin \
mvn-org.eclipse.cbi.maven.plugins-eclipse-cbi-plugin-pom- \
mvn-org.eclipse.cbi.maven.plugins-eclipse-dmg-packager \
mvn-org.eclipse.cbi.maven.plugins-eclipse-dmg-packager-pom- \
mvn-org.eclipse.cbi.maven.plugins-eclipse-flatpak-packager \
mvn-org.eclipse.cbi.maven.plugins-eclipse-flatpak-packager-pom- \
mvn-org.eclipse.cbi.maven.plugins-eclipse-jarsigner-plugin \
mvn-org.eclipse.cbi.maven.plugins-eclipse-jarsigner-plugin-pom- \
mvn-org.eclipse.cbi.maven.plugins-maven-plugin-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-annotations \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-com.google.auto.value-auto-value \
mvn-com.google.auto.value-auto-value-annotations \
mvn-com.google.code.findbugs-jsr305 \
mvn-com.google.guava-guava \
mvn-de.pdark-decentxml \
mvn-org.apache.commons-commons-compress \
mvn-org.apache.httpcomponents-httpclient \
mvn-org.apache.httpcomponents-httpmime \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.bouncycastle-bcpg-jdk15on \
mvn-org.eclipse.tycho-tycho-core"

inherit rpm
