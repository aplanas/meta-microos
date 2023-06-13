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

RPM_NAME = "google-guice-5.1.0-1.1.noarch.rpm"
RPM_HASH = "d506f07b508dd4ffdaa6e58010b3cec88269a2c3791aa0b86f260b0a364ed9d2a95b18c6bc3044fd1f47f7be2db7bb15cecc1c231e2dd4c96a7c795181f8bf04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-guice \
guice-multibindings \
mvn(com.google.inject:guice) \
mvn(com.google.inject:guice::no_aop:) \
mvn(com.google.inject:guice:pom:) \
mvn(com.google.inject:guice:pom:no_aop:) \
mvn(org.sonatype.sisu:sisu-guice) \
mvn(org.sonatype.sisu:sisu-guice::no_aop:) \
mvn(org.sonatype.sisu:sisu-guice:pom:) \
mvn(org.sonatype.sisu:sisu-guice:pom:no_aop:) \
osgi(com.google.inject)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(aopalliance:aopalliance) \
mvn(com.google.guava:guava) \
mvn(javax.inject:javax.inject)"

inherit rpm
