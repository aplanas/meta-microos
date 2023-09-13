SUMMARY = "JBoss Marshalling OSGi Bundle"
DESCRIPTION = "JBoss Marshalling OSGi Bundle."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later"

PV = "1.4.11"

RPM_NAME = "jboss-marshalling-osgi-1.4.11-2.1.noarch.rpm"
RPM_HASH = "eb846ce5d10e85bbd0cf9eb94222fb1268dc3ac8ff6bc6f21f5a1a711e667f3af42dd21155ee2f1ca6fac3ef149147df6cc0eaf36a886434b445b6c5a4ec70d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-marshalling-osgi \
mvn-org.jboss.marshalling-jboss-marshalling-osgi \
mvn-org.jboss.marshalling-jboss-marshalling-osgi-pom- \
osgi-org.jboss.marshalling.jboss-marshalling-osgi"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.jboss.marshalling-jboss-marshalling \
mvn-org.jboss.marshalling-jboss-marshalling-river \
mvn-org.jboss.marshalling-jboss-marshalling-serial"

inherit rpm
