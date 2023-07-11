SUMMARY = "SSH-2 protocol implementation in pure Java"
DESCRIPTION = "Trilead SSH-2 for Java is a library which implements the SSH-2 protocol in pure \
Java (tested on J2SE 1.4.2 and 5.0). It allows one to connect to SSH servers \
from within Java programs. It supports SSH sessions (remote command execution \
and shell access), local and remote port forwarding, local stream forwarding, \
X11 forwarding and SCP. There are no dependencies on any JCE provider, as all \
crypto functionality is included."
LICENSE = "BSD-3-Clause & MIT"

PV = "217.8"

RPM_NAME = "trilead-ssh2-217.8-2.7.noarch.rpm"
RPM_HASH = "c07407965f92b5e6862fc6422101606944dd4e098346a95f7d37ac4a704f25ac88f7fd252da92b80544114427310b7cbb51a00aa52866c2899b5104e0f848d39"
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
