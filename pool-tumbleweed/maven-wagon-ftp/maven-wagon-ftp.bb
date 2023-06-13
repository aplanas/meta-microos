SUMMARY = "The ftp module for maven-wagon"
DESCRIPTION = "The ftp module for maven-wagon."
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "maven-wagon-ftp-3.5.3-1.1.noarch.rpm"
RPM_HASH = "b8ff7bac5f2b98052f8a3cb4f2ad197a7bc7ac14930771cedb966a70032840083ce53e28b511e1658b4ea10c931f806fa6a920024e06ff1a7e9e00741c177a37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-wagon-ftp \
mvn(org.apache.maven.wagon:wagon-ftp) \
mvn(org.apache.maven.wagon:wagon-ftp:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(commons-io:commons-io) \
mvn(commons-net:commons-net) \
mvn(org.apache.maven.wagon:wagon-provider-api) \
mvn(org.slf4j:slf4j-api) \
mvn(org.slf4j:slf4j-simple)"

inherit rpm
