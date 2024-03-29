SUMMARY = "Eclipse JGit"
DESCRIPTION = "Command line Git tool built entirely in Java."
LICENSE = "BSD-3-Clause"

PV = "5.11.0"

RPM_NAME = "jgit-5.11.0-7.2.noarch.rpm"
RPM_HASH = "aaa1ee0a15e41495a620b8bb88a23a5ca35378fb416c74cd05103ec2dd4223aba1bb197334dc52189f58948983e4d60115d4256d57e52a16bd027b041efa74b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-jgit \
jgit \
mvn-org.eclipse.jgit-org.eclipse.jgit \
mvn-org.eclipse.jgit-org.eclipse.jgit-parent-pom- \
mvn-org.eclipse.jgit-org.eclipse.jgit-pom- \
mvn-org.eclipse.jgit-org.eclipse.jgit.ant \
mvn-org.eclipse.jgit-org.eclipse.jgit.ant-pom- \
mvn-org.eclipse.jgit-org.eclipse.jgit.archive \
mvn-org.eclipse.jgit-org.eclipse.jgit.archive-pom- \
mvn-org.eclipse.jgit-org.eclipse.jgit.gpg.bc \
mvn-org.eclipse.jgit-org.eclipse.jgit.gpg.bc-pom- \
mvn-org.eclipse.jgit-org.eclipse.jgit.http.apache \
mvn-org.eclipse.jgit-org.eclipse.jgit.http.apache-pom- \
mvn-org.eclipse.jgit-org.eclipse.jgit.http.server \
mvn-org.eclipse.jgit-org.eclipse.jgit.http.server-pom- \
mvn-org.eclipse.jgit-org.eclipse.jgit.junit \
mvn-org.eclipse.jgit-org.eclipse.jgit.junit-pom- \
mvn-org.eclipse.jgit-org.eclipse.jgit.junit.http \
mvn-org.eclipse.jgit-org.eclipse.jgit.junit.http-pom- \
mvn-org.eclipse.jgit-org.eclipse.jgit.junit.ssh \
mvn-org.eclipse.jgit-org.eclipse.jgit.junit.ssh-pom- \
mvn-org.eclipse.jgit-org.eclipse.jgit.lfs \
mvn-org.eclipse.jgit-org.eclipse.jgit.lfs-pom- \
mvn-org.eclipse.jgit-org.eclipse.jgit.lfs.server \
mvn-org.eclipse.jgit-org.eclipse.jgit.lfs.server-pom- \
mvn-org.eclipse.jgit-org.eclipse.jgit.pgm \
mvn-org.eclipse.jgit-org.eclipse.jgit.pgm-pom- \
mvn-org.eclipse.jgit-org.eclipse.jgit.ssh.apache \
mvn-org.eclipse.jgit-org.eclipse.jgit.ssh.apache-pom- \
mvn-org.eclipse.jgit-org.eclipse.jgit.ssh.jsch \
mvn-org.eclipse.jgit-org.eclipse.jgit.ssh.jsch-pom- \
mvn-org.eclipse.jgit-org.eclipse.jgit.ui \
mvn-org.eclipse.jgit-org.eclipse.jgit.ui-pom- \
osgi-org.eclipse.jgit \
osgi-org.eclipse.jgit.ant \
osgi-org.eclipse.jgit.archive \
osgi-org.eclipse.jgit.gpg.bc \
osgi-org.eclipse.jgit.http.apache \
osgi-org.eclipse.jgit.http.server \
osgi-org.eclipse.jgit.junit \
osgi-org.eclipse.jgit.junit.http \
osgi-org.eclipse.jgit.junit.ssh \
osgi-org.eclipse.jgit.lfs \
osgi-org.eclipse.jgit.lfs.server \
osgi-org.eclipse.jgit.pgm \
osgi-org.eclipse.jgit.ssh.apache \
osgi-org.eclipse.jgit.ssh.jsch \
osgi-org.eclipse.jgit.ui"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
mvn-args4j-args4j \
mvn-com.google.code.gson-gson \
mvn-com.googlecode.javaewah-JavaEWAH \
mvn-com.jcraft-jsch \
mvn-com.jcraft-jzlib \
mvn-net.i2p.crypto-eddsa \
mvn-org.apache.ant-ant \
mvn-org.apache.commons-commons-compress \
mvn-org.apache.httpcomponents-httpclient \
mvn-org.apache.httpcomponents-httpcore \
mvn-org.apache.sshd-sshd-osgi \
mvn-org.apache.sshd-sshd-sftp \
mvn-org.bouncycastle-bcpg-jdk15on \
mvn-org.bouncycastle-bcpkix-jdk15on \
mvn-org.bouncycastle-bcprov-jdk15on \
mvn-org.eclipse.jetty-jetty-servlet \
mvn-org.osgi-osgi.core \
mvn-org.slf4j-slf4j-api \
mvn-org.slf4j-slf4j-simple \
xz-java"

inherit rpm
