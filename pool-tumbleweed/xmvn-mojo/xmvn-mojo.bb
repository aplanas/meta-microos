SUMMARY = "XMvn MOJO"
DESCRIPTION = "This package provides XMvn MOJO, which is a Maven plugin that consists \
of several MOJOs.  Some goals of these MOJOs are intended to be \
attached to default Maven lifecycle when building packages, others can \
be called directly from Maven command line."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-mojo-4.2.0-2.1.noarch.rpm"
RPM_HASH = "0245b6292be16e49c2d19329db0450d3421056119ceb08b28c48efd473eb69286db2268507273a6b668c72475f964eb8e84e00dd8decdae976b9d1b0ca2d7b59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.fedoraproject.xmvn:xmvn-mojo) \
mvn(org.fedoraproject.xmvn:xmvn-mojo:pom:) \
xmvn-mojo"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven.resolver:maven-resolver-util) \
mvn(org.fedoraproject.xmvn:xmvn-api) \
mvn(org.fedoraproject.xmvn:xmvn-core) \
mvn(org.ow2.asm:asm)"

inherit rpm
