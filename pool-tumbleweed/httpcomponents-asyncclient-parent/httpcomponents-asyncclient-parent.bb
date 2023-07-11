SUMMARY = "Apache HttpAsyncClient Parent POM"
DESCRIPTION = "Apache HttpAsyncClient Parent POM."
LICENSE = "Apache-2.0"

PV = "4.1.4"

RPM_NAME = "httpcomponents-asyncclient-parent-4.1.4-3.10.noarch.rpm"
RPM_HASH = "ea91ae212d8d1364dabd0b23bdaf114fbd8e623d6d24479624a10c3cf0b0f2b8ebd5c68d06a24654302f8cfe9c01fa527ad9e89cf55c40df49ba879fbc4ae3f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "httpcomponents-asyncclient-parent \
mvn-org.apache.httpcomponents-httpcomponents-asyncclient-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.httpcomponents-project-pom- \
mvn-org.apache.maven.plugins-maven-jar-plugin"

inherit rpm
