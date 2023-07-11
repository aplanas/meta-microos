SUMMARY = "Dependency injection framework for Java 5 and above"
DESCRIPTION = "Guice alleviates the need for factories and the use of 'new' in Java \
code. Guice's @Inject is a different 'new'. Writing factories will \
still be needed in some cases, but code will not directly depend on \
them. \
 \
Guice embraces Java's type safe nature, especially when it comes to \
features introduced in Java 5 such as generics and annotations."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "google-guice-5.1.0-1.2.noarch.rpm"
RPM_HASH = "c812228e9fab1fa884ae12071fd859299a9a6399c671b95308719decce11602dad4bc1549eedd4560211528e611a4ceda457186f1ceadb6c50bd98276217ac3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-guice \
guice-multibindings \
mvn-com.google.inject-guice \
mvn-com.google.inject-guice--no-aop- \
mvn-com.google.inject-guice-pom- \
mvn-com.google.inject-guice-pom-no-aop- \
mvn-org.sonatype.sisu-sisu-guice \
mvn-org.sonatype.sisu-sisu-guice--no-aop- \
mvn-org.sonatype.sisu-sisu-guice-pom- \
mvn-org.sonatype.sisu-sisu-guice-pom-no-aop- \
osgi-com.google.inject"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-aopalliance-aopalliance \
mvn-com.google.guava-guava \
mvn-javax.inject-javax.inject"

inherit rpm
