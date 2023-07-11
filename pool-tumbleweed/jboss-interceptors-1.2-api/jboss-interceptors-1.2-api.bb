SUMMARY = "Java EE Interceptors 1.2 API"
DESCRIPTION = "The Java EE  Interceptors 1.2 API classes from JSR 318."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.0.0"

RPM_NAME = "jboss-interceptors-1.2-api-1.0.0-2.7.noarch.rpm"
RPM_HASH = "2963507a5de7b24369f04d8f48017eff6c57b24754cf87af1429e1222eba5d3cbbd9c05e63b2e8de8eef88733c27c6ee5d19d8be55fbc4d5950a0ca4a8997df1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-interceptors-1.2-api \
mvn-org.jboss.spec.javax.interceptor-jboss-interceptors-api-1.2-spec \
mvn-org.jboss.spec.javax.interceptor-jboss-interceptors-api-1.2-spec-pom- \
osgi-org.jboss.spec.javax.interceptor.jboss-interceptors-api-1.2-spec"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
