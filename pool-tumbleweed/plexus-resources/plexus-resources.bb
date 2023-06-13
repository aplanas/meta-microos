SUMMARY = "Plexus Resource Manager"
DESCRIPTION = "Plexus contains end-to-end developer tools for writing applications. \
At the core is the container, which can be embedded or for an \
application server. There are many reusable components for hibernate, \
form processing, jndi, i18n, velocity, etc. Plexus also includes an \
application server which is like a J2EE application server."
LICENSE = "MIT"

PV = "1.0~a7"

RPM_NAME = "plexus-resources-1.0~a7-2.6.noarch.rpm"
RPM_HASH = "f9d8f9e3ede7391c9bb24c03fb4de6b3e13f073ccecc1ab113d98c37b93e7edecca9f8068a57ca1c6b9bd551bb827d3c9fe17eee3b3eb87eaf9bca60adc1daea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.codehaus.plexus:plexus-resources) \
mvn(org.codehaus.plexus:plexus-resources:pom:) \
plexus-resources"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.codehaus.plexus:plexus-container-default) \
mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
