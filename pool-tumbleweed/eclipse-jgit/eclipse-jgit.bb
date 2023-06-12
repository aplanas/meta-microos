SUMMARY = "Eclipse JGit"
DESCRIPTION = "A pure Java implementation of the Git version control system."
LICENSE = "BSD-3-Clause"

PV = "5.11.0"

RPM_NAME = "eclipse-jgit-5.11.0-7.1.noarch.rpm"
RPM_HASH = "ff036a50c65c29205c516e2bfb6a012b450dcd728d01f5295d41f7be679ceee8bd862ec2c49ddf9074b28a3efda08bd6f1dbede855e9f622736d1932a640d06f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eclipse-jgit \
mvn(org.eclipse.jgit.feature:org.eclipse.jgit) \
mvn(org.eclipse.jgit.feature:org.eclipse.jgit.gpg.bc) \
mvn(org.eclipse.jgit.feature:org.eclipse.jgit.http.apache) \
mvn(org.eclipse.jgit.feature:org.eclipse.jgit.junit) \
mvn(org.eclipse.jgit.feature:org.eclipse.jgit.lfs) \
mvn(org.eclipse.jgit.feature:org.eclipse.jgit.pgm) \
mvn(org.eclipse.jgit.feature:org.eclipse.jgit.ssh.apache) \
mvn(org.eclipse.jgit.feature:org.eclipse.jgit.ssh.jsch)"
RDEPENDS:${PN} += "apache-commons-compress \
apache-sshd \
args4j \
bouncycastle \
bouncycastle-pg \
bouncycastle-pkix \
ed25519-java \
google-gson \
hamcrest-core \
java-headless \
javaewah \
javapackages-filesystem \
jgit \
junit \
jzlib \
slf4j \
xml-commons-apis"

inherit rpm
