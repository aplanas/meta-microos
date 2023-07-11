SUMMARY = "XMvn MOJO"
DESCRIPTION = "This package provides XMvn MOJO, which is a Maven plugin that consists \
of several MOJOs.  Some goals of these MOJOs are intended to be \
attached to default Maven lifecycle when building packages, others can \
be called directly from Maven command line."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-mojo-4.2.0-2.2.noarch.rpm"
RPM_HASH = "83d553984a075ae5beb7e0b773cf4f15dbc5940802b6b3662c96ebd14849c092a7e6b9194de31462491a79bc8ce47490ac57043a841fbae4f9d6b61e6d1b235f"
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
