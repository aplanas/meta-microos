SUMMARY = "Java Servlet API"
DESCRIPTION = "The javax.servlet package contains a number of classes \
and interfaces that describe and define the contracts between \
a servlet class and the runtime environment provided for \
an instance of such a class by a conforming servlet container."
LICENSE = "(CDDL-1.0 | GPL-2.0-only-WITH-Classpath-exception-2.0) & Apache-2.0"

PV = "3.1.0"

RPM_NAME = "glassfish-servlet-api-3.1.0-2.19.noarch.rpm"
RPM_HASH = "82dd3859aeb09ca21f5d9c0f52bf0bef1356f2a7a8ebe488a2e90f38a7e9dcf29e1878b29fca68420aeca5ffe8e656f587d91d43279f959072e631bc598645a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-servlet-api \
mvn(javax.servlet:javax.servlet-api) \
mvn(javax.servlet:javax.servlet-api:pom:) \
mvn(javax.servlet:servlet-api) \
mvn(javax.servlet:servlet-api:pom:) \
mvn(org.apache.geronimo.specs:geronimo-servlet_3.0_spec) \
mvn(org.apache.geronimo.specs:geronimo-servlet_3.0_spec:pom:) \
mvn(org.eclipse.jetty.orbit:javax.servlet) \
mvn(org.eclipse.jetty.orbit:javax.servlet:pom:) \
osgi(javax.servlet-api)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
