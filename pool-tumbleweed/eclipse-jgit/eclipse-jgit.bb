SUMMARY = "Eclipse JGit"
DESCRIPTION = "A pure Java implementation of the Git version control system."
LICENSE = "BSD-3-Clause"

PV = "5.11.0"

RPM_NAME = "eclipse-jgit-5.11.0-7.2.noarch.rpm"
RPM_HASH = "813fc699d69dcb914a51f5f4a19bad5ccc56fdd019731afe0034772c598a34795aa64d666a7ba6ad32fa88b84484bc54331a0e2d576204cc1570210ee84836c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eclipse-jgit \
mvn-org.eclipse.jgit.feature-org.eclipse.jgit \
mvn-org.eclipse.jgit.feature-org.eclipse.jgit.gpg.bc \
mvn-org.eclipse.jgit.feature-org.eclipse.jgit.http.apache \
mvn-org.eclipse.jgit.feature-org.eclipse.jgit.junit \
mvn-org.eclipse.jgit.feature-org.eclipse.jgit.lfs \
mvn-org.eclipse.jgit.feature-org.eclipse.jgit.pgm \
mvn-org.eclipse.jgit.feature-org.eclipse.jgit.ssh.apache \
mvn-org.eclipse.jgit.feature-org.eclipse.jgit.ssh.jsch"

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
