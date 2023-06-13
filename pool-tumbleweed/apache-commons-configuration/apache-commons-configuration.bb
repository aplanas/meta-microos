SUMMARY = "Commons Configuration Package"
DESCRIPTION = "Configuration is a project to provide a generic Configuration \
interface and allow the source of the values to vary. It \
provides easy typed access to single, as well as lists of \
configuration values based on a 'key'. \
Right now you can load properties from a simple properties \
file, a properties file in a jar, an XML file, JNDI settings, \
as well as use a mix of different sources using a \
ConfigurationFactory and CompositeConfiguration. \
Custom configuration objects are very easy to create now \
by just subclassing AbstractConfiguration. This works \
similar to how AbstractList works."
LICENSE = "Apache-2.0"

PV = "1.10"

RPM_NAME = "apache-commons-configuration-1.10-4.6.noarch.rpm"
RPM_HASH = "3cd5aea340f9c1f3931ebaae3065efbf37124b29574bb114edcc96e1f90652082af7535dc4999cd0c22193b1388ddd512e205f4d7e3224c44907e1e2a506896d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-configuration \
mvn(commons-configuration:commons-configuration) \
mvn(commons-configuration:commons-configuration:pom:) \
mvn(org.apache.commons:commons-configuration) \
mvn(org.apache.commons:commons-configuration:pom:) \
osgi(org.apache.commons.commons-configuration)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(commons-lang:commons-lang) \
mvn(commons-logging:commons-logging)"

inherit rpm
