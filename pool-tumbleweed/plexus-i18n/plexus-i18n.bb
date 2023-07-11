SUMMARY = "Plexus I18N Component"
DESCRIPTION = "Plexus contains end-to-end developer tools for writing applications. \
At the core is the container, which can be embedded or for an \
application server. There are many reusable components for hibernate, \
form processing, jndi, i18n, velocity, etc. Plexus also includes an \
application server which is like a J2EE application server."
LICENSE = "Apache-2.0"

PV = "1.0~beta10"

RPM_NAME = "plexus-i18n-1.0~beta10-3.7.noarch.rpm"
RPM_HASH = "a9bed32ffe729ec40639bac08bcabd2936cb86feed8e56bc6e04dde2da8320677dbb31c8c95e2d8959830c6973784baa8ad050b48c2c1eafc1192db585d31cc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-i18n \
mvn-org.codehaus.plexus-plexus-i18n-pom- \
plexus-i18n"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-container-default \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
