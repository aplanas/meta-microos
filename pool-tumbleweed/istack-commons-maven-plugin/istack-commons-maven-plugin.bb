SUMMARY = "Istack-commons Maven Mojo"
DESCRIPTION = "This package contains the istack-commons Maven Mojo."
LICENSE = "CDDL-1.1 & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "3.0.7"

RPM_NAME = "istack-commons-maven-plugin-3.0.7-4.5.noarch.rpm"
RPM_HASH = "ba8739ef4298faff513261a715b3c1a49cd9d43cbb76075cc7bae75283ea1fd3da94226c085dbb1b2a606a5230846baf06683d8433c16d330bf922bf56a712c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istack-commons-maven-plugin \
mvn-com.sun.istack-istack-commons-maven-plugin \
mvn-com.sun.istack-istack-commons-maven-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.sun.codemodel-codemodel \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven.resolver-maven-resolver-impl \
mvn-org.apache.maven.shared-file-management \
mvn-org.codehaus.plexus-plexus-archiver \
mvn-org.codehaus.plexus-plexus-io \
mvn-org.tukaani-xz"

inherit rpm
