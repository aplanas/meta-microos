SUMMARY = "XMvn Parent POM"
DESCRIPTION = "This package provides XMvn parent POM."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-parent-4.2.0-3.1.noarch.rpm"
RPM_HASH = "33c0e94737b12664c86d967bf526357dc016c6ce9ae8a55114d72d68f8c2613dd2b3ca7b0e2a0ed63f96fba6c2cb3749f0f40907b3f1ae1479a950a597d1e020"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.fedoraproject.xmvn-xmvn-parent-pom- \
xmvn-parent \
xmvn-parent-pom"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
