SUMMARY = "Java plugin based web server"
DESCRIPTION = "XBean is a plugin-based server analogous to Eclipse being a \
plugin-based IDE. XBean is able to discover, download and install \
server plugins from an Internet-based repository. Support for \
multiple IoC systems, support for running with no IoC system, JMX \
without JMX code, lifecycle and class loader management, and a Spring \
integration is included."
LICENSE = "Apache-2.0"

PV = "4.20"

RPM_NAME = "xbean-4.20-1.6.noarch.rpm"
RPM_HASH = "56ae1b4242e66976a981779917e6f4e29ed688b800cbde4bb56193d0c0ac14e5c945d694949e8743768dad6e524e87d4533b3e1d4504a61b8a459840db44d78d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.apache.xbean:xbean-asm-util) \
mvn(org.apache.xbean:xbean-asm-util:pom:) \
mvn(org.apache.xbean:xbean-finder) \
mvn(org.apache.xbean:xbean-finder:pom:) \
mvn(org.apache.xbean:xbean-reflect) \
mvn(org.apache.xbean:xbean-reflect:pom:) \
osgi(org.apache.xbean.asm-util) \
osgi(org.apache.xbean.finder) \
osgi(org.apache.xbean.reflect) \
xbean"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.slf4j:slf4j-api) \
objectweb-asm \
slf4j"

inherit rpm
