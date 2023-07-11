SUMMARY = "Dependency injection specification for Java (JSR-330)"
DESCRIPTION = "This package specifies a means for obtaining objects in such a way as \
to maximize reusability, testability and maintainability compared to \
traditional approaches such as constructors, factories, and service \
locators (e.g., JNDI). This process, known as dependency injection, is \
beneficial to most nontrivial applications."
LICENSE = "Apache-2.0"

PV = "1+20160610git1f74ea7"

RPM_NAME = "atinject-1+20160610git1f74ea7-2.7.noarch.rpm"
RPM_HASH = "74c9d1990279a769ccc9229d596bb452f6f1c53425bc3b154d7363935d34997b45fac86aaa94eae128bb73c6a2fa681ad4d8b5a75ff94589bdaf5c59156a7aeb"
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
