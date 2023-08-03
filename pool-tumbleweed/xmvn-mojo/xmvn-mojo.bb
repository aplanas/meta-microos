SUMMARY = "XMvn MOJO"
DESCRIPTION = "This package provides XMvn MOJO, which is a Maven plugin that consists \
of several MOJOs.  Some goals of these MOJOs are intended to be \
attached to default Maven lifecycle when building packages, others can \
be called directly from Maven command line."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-mojo-4.2.0-3.1.noarch.rpm"
RPM_HASH = "c123583f164de738046eea276bea484bf6f770fc44f4f1b7bb672e4f4d4fae1df7fa3e87e7d1c25a014875f4500bf06fd68a4186110e71077dcfe0477f4f8d15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.fedoraproject.xmvn-xmvn-mojo \
mvn-org.fedoraproject.xmvn-xmvn-mojo-pom- \
xmvn-mojo"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.resolver-maven-resolver-util \
mvn-org.fedoraproject.xmvn-xmvn-api \
mvn-org.fedoraproject.xmvn-xmvn-core \
mvn-org.ow2.asm-asm"

inherit rpm
