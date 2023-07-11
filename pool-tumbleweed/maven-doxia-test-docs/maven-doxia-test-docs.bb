SUMMARY = "Test-docs module for maven-doxia"
DESCRIPTION = "This package provides Test-docs module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "1.9.1"

RPM_NAME = "maven-doxia-test-docs-1.9.1-6.8.noarch.rpm"
RPM_HASH = "5a73ec23bade5c59e0a743cfe8953b6bc6e11053fd687db79d43535fdb0201883d7d8ac754c75fe7ef0ce053e364725cd45f7da43cdbd669fa087bc088ac1afa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-test-docs \
mvn-org.apache.maven.doxia-doxia-test-docs \
mvn-org.apache.maven.doxia-doxia-test-docs-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
