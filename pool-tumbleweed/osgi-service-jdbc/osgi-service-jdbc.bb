SUMMARY = "OSGi Service JDBC"
DESCRIPTION = "OSGi Companion Code for org.osgi.service.jdbc Version 1.0.0."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "osgi-service-jdbc-1.0.0-1.2.noarch.rpm"
RPM_HASH = "4a11cc3e26bf4e488095d9caf26beccfb4bad57b6c42bf5c75d1ca7aa1d73c6bac33008b684fce6bfafa79d76663e03945d807dd5478ad4b9909e64f1da79b40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.osgi-org.osgi.service.jdbc \
mvn-org.osgi-org.osgi.service.jdbc-pom- \
osgi-org.osgi.service.jdbc \
osgi-service-jdbc"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
