SUMMARY = "Apache HttpAsyncClient Parent POM"
DESCRIPTION = "Apache HttpAsyncClient Parent POM."
LICENSE = "Apache-2.0"

PV = "4.1.4"

RPM_NAME = "httpcomponents-asyncclient-parent-4.1.4-3.9.noarch.rpm"
RPM_HASH = "7091407f60442f2f617f94d4646db8921cfaba771ce23a3ceb357632769c38f7329e2f886e7c9c64389f42ad24e81ca97394fd2bc4b6755f043a7f775200ef92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "httpcomponents-asyncclient-parent \
mvn(org.apache.httpcomponents:httpcomponents-asyncclient:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.httpcomponents:project:pom:) \
mvn(org.apache.maven.plugins:maven-jar-plugin)"

inherit rpm
