SUMMARY = "Java plugin based web server"
DESCRIPTION = "XBean is a plugin-based server analogous to Eclipse being a \
plugin-based IDE. XBean is able to discover, download and install \
server plugins from an Internet-based repository. Support for \
multiple IoC systems, support for running with no IoC system, JMX \
without JMX code, lifecycle and class loader management, and a Spring \
integration is included."
LICENSE = "Apache-2.0"

PV = "4.20"

RPM_NAME = "xbean-4.20-1.7.noarch.rpm"
RPM_HASH = "6df29125ce5d18ef59c76ebb2dec8f5f82d3cb19d430129b14085df248caeaad2a91d1eafb0f8c739fafca0198b06e0c58964d001447283230d71c1bfdd2cb42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.xbean-xbean-asm-util \
mvn-org.apache.xbean-xbean-asm-util-pom- \
mvn-org.apache.xbean-xbean-finder \
mvn-org.apache.xbean-xbean-finder-pom- \
mvn-org.apache.xbean-xbean-reflect \
mvn-org.apache.xbean-xbean-reflect-pom- \
osgi-org.apache.xbean.asm-util \
osgi-org.apache.xbean.finder \
osgi-org.apache.xbean.reflect \
xbean"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.slf4j-slf4j-api \
objectweb-asm \
slf4j"

inherit rpm
