SUMMARY = "The ftp module for maven-wagon"
DESCRIPTION = "The ftp module for maven-wagon."
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "maven-wagon-ftp-3.5.3-1.2.noarch.rpm"
RPM_HASH = "c2be056d87194c862edbef6a6a42d3af41e6f1c8262270e389b499f7a6a6fde98dec7ebc7d2dd0659cbd4f4110998514bbbb894003bcd3745ba69d89f6a44743"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-wagon-ftp \
mvn-org.apache.maven.wagon-wagon-ftp \
mvn-org.apache.maven.wagon-wagon-ftp-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-commons-net-commons-net \
mvn-org.apache.maven.wagon-wagon-provider-api \
mvn-org.slf4j-slf4j-api \
mvn-org.slf4j-slf4j-simple"

inherit rpm
