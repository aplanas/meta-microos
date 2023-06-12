SUMMARY = "OSGi Service JDBC"
DESCRIPTION = "OSGi Companion Code for org.osgi.service.jdbc Version 1.0.0."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "osgi-service-jdbc-1.0.0-1.1.noarch.rpm"
RPM_HASH = "4df1a90f3b8b9d93844c0f4ddc37119a3e9aeb6251081ac38ac1ddf2e6496a0bebcfcfc8e50e736a746b3065231b64e96b4ddda7a1e7bebd22954ea8590cd426"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.osgi:org.osgi.service.jdbc) \
mvn(org.osgi:org.osgi.service.jdbc:pom:) \
osgi(org.osgi.service.jdbc) \
osgi-service-jdbc"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
