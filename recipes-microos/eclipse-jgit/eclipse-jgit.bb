SUMMARY = "Eclipse JGit"
DESCRIPTION = "A pure Java implementation of the Git version control system."
LICENSE = "BSD-3-Clause"

PV = "5.11.0"

RPM_NAME = "eclipse-jgit-5.11.0-6.1.noarch.rpm"
RPM_HASH = "402963319aae042706cf698da552a86aa20e060a93f048fddc329265c084caa163c094773d012f86ece7782304af5734ca3a62bc2c80e99617a0b414c9b287dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eclipse-jgit mvn(org.eclipse.jgit.feature:org.eclipse.jgit) mvn(org.eclipse.jgit.feature:org.eclipse.jgit.gpg.bc) mvn(org.eclipse.jgit.feature:org.eclipse.jgit.http.apache) mvn(org.eclipse.jgit.feature:org.eclipse.jgit.junit) mvn(org.eclipse.jgit.feature:org.eclipse.jgit.lfs) mvn(org.eclipse.jgit.feature:org.eclipse.jgit.pgm) mvn(org.eclipse.jgit.feature:org.eclipse.jgit.ssh.apache) mvn(org.eclipse.jgit.feature:org.eclipse.jgit.ssh.jsch)"
RDEPENDS:${PN} += "apache-commons-compress apache-sshd args4j bouncycastle bouncycastle-pg bouncycastle-pkix ed25519-java google-gson hamcrest-core java-headless javaewah javapackages-filesystem jgit junit jzlib slf4j xml-commons-apis"

inherit rpm
