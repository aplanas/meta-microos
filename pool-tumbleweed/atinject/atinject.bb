SUMMARY = "Dependency injection specification for Java (JSR-330)"
DESCRIPTION = "This package specifies a means for obtaining objects in such a way as \
to maximize reusability, testability and maintainability compared to \
traditional approaches such as constructors, factories, and service \
locators (e.g., JNDI). This process, known as dependency injection, is \
beneficial to most nontrivial applications."
LICENSE = "Apache-2.0"

PV = "1+20160610git1f74ea7"

RPM_NAME = "atinject-1+20160610git1f74ea7-2.6.noarch.rpm"
RPM_HASH = "d6a54c108b0d96505000a8b80d3ba5fb675916dee4ac5ba8403a69451d7b0be412e2ef452bdc01bc57b868118cb4cd92fc6445a0e8e1230c01e4bc51662047e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "atinject \
mvn-jakarta.inject-jakarta.inject-api \
mvn-jakarta.inject-jakarta.inject-api-pom- \
mvn-javax.inject-javax.inject \
mvn-javax.inject-javax.inject-pom- \
osgi-javax.inject"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
