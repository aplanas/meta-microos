SUMMARY = "ParaNamer Parent POM"
DESCRIPTION = "This package contains the ParaNamer Parent POM."
LICENSE = "BSD-3-Clause"

PV = "2.8"

RPM_NAME = "paranamer-parent-2.8-3.1.noarch.rpm"
RPM_HASH = "7c1ee58ba4bd0ca38a93e4c3f85d5fa620f9c126f822c6c1725e743842a5e41e35acd0185eb0104dc86bf870fa3e052d655242a78efb156141e4691324506aac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.thoughtworks.paranamer-paranamer-parent-pom- \
paranamer-parent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.plugins-maven-compiler-plugin \
mvn-org.apache.maven.plugins-maven-surefire-plugin"

inherit rpm
