SUMMARY = "XMvn MOJO"
DESCRIPTION = "This package provides XMvn MOJO, which is a Maven plugin that consists \
of several MOJOs.  Some goals of these MOJOs are intended to be \
attached to default Maven lifecycle when building packages, others can \
be called directly from Maven command line."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-mojo-4.2.0-4.1.noarch.rpm"
RPM_HASH = "c676e88101f80e016ee120f229caba4193961582a8455076c5100f2d1b466c454cfb7559966ba8d0ff8ae178be71652d090adc50dfba7f5dc270d2af9a2ccdbb"
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
