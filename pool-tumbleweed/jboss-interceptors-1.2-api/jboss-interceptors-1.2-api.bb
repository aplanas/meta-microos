SUMMARY = "Java EE Interceptors 1.2 API"
DESCRIPTION = "The Java EE  Interceptors 1.2 API classes from JSR 318."
LICENSE = "CDDL-1.0 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "1.0.0"

RPM_NAME = "jboss-interceptors-1.2-api-1.0.0-2.6.noarch.rpm"
RPM_HASH = "51126f14310dd20b61fdb096028797ddf4c1a7cd18c063d3f8a886b41778036770269054bcc0511911fa2720a1a81b5594eeaffeb34995c487b270fbb4a7e247"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-interceptors-1.2-api \
mvn(org.jboss.spec.javax.interceptor:jboss-interceptors-api_1.2_spec) \
mvn(org.jboss.spec.javax.interceptor:jboss-interceptors-api_1.2_spec:pom:) \
osgi(org.jboss.spec.javax.interceptor.jboss-interceptors-api_1.2_spec)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
