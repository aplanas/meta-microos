SUMMARY = "SSH-2 protocol implementation in pure Java"
DESCRIPTION = "Trilead SSH-2 for Java is a library which implements the SSH-2 protocol in pure \
Java (tested on J2SE 1.4.2 and 5.0). It allows one to connect to SSH servers \
from within Java programs. It supports SSH sessions (remote command execution \
and shell access), local and remote port forwarding, local stream forwarding, \
X11 forwarding and SCP. There are no dependencies on any JCE provider, as all \
crypto functionality is included."
LICENSE = "BSD-3-Clause & MIT"

PV = "217.8"

RPM_NAME = "trilead-ssh2-217.8-2.6.noarch.rpm"
RPM_HASH = "a62d6a237487e9ce8b06f0f4ec2131d855150a52d4d33fb5b76a1cdcb5740d09ddc0fad1be09ba51fc37943f9c06f1930a9de4927e965703c79c8f309c3af6bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.trilead-trilead-ssh2 \
mvn-com.trilead-trilead-ssh2-pom- \
mvn-org.jenkins-ci-trilead-ssh2 \
mvn-org.jenkins-ci-trilead-ssh2-pom- \
mvn-org.tmatesoft.svnkit-trilead-ssh2 \
mvn-org.tmatesoft.svnkit-trilead-ssh2-pom- \
trilead-ssh2"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
