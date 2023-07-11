SUMMARY = "Maven Plugin Java 5 Annotations"
DESCRIPTION = "This package contains Java 5 annotations to use in Mojos."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-annotations-3.6.0-5.2.noarch.rpm"
RPM_HASH = "019793ccf8a028bd432af5ce3181bde521737bc8b781a0e9dbf525f2a49d58589a38b866ef6239cd9e1fbe78c9eff0aba8d95dae5a9ce16f56c2faff7de5d4e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-annotations \
mvn-org.apache.maven.plugin-tools-maven-plugin-annotations \
mvn-org.apache.maven.plugin-tools-maven-plugin-annotations-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-artifact"

inherit rpm
