SUMMARY = "Parent POM for signpost-core"
DESCRIPTION = "This package contains the Parent POM for signpost-core."
LICENSE = "Apache-2.0"

PV = "1.2.1.2"

RPM_NAME = "oauth-signpost-1.2.1.2-3.11.noarch.rpm"
RPM_HASH = "71c4eaa38f6407c38cef3f9804f977400db6372ffc59150f316d684716a633c86c6476b6ac958766ee31125eecedb8bf6a8448a9c839aa0a2c771f80efcf72f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-oauth.signpost-oauth-signpost-pom- \
oauth-signpost"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.plugins-maven-compiler-plugin \
mvn-org.apache.maven.plugins-maven-jar-plugin"

inherit rpm
