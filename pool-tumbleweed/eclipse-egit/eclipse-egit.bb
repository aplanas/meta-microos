SUMMARY = "Eclipse Git Integration"
DESCRIPTION = "The eclipse-egit package contains Eclipse plugins for \
interacting with Git repositories."
LICENSE = "EPL-2.0"

PV = "5.11.0"

RPM_NAME = "eclipse-egit-5.11.0-3.6.noarch.rpm"
RPM_HASH = "413fe30ed2a9fe1036982a1150cb35572f26580f8a46ebdfcde909b3a59ff912bb55d6a0bb7af8ebe11fa8569cc204e82461cbe9e8cdaa35f5f4ec7e4fa050cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eclipse-egit \
mvn-org.eclipse.egit-org.eclipse.egit \
mvn-org.eclipse.egit-org.eclipse.egit.core \
mvn-org.eclipse.egit-org.eclipse.egit.core--sources- \
mvn-org.eclipse.egit-org.eclipse.egit.core.junit \
mvn-org.eclipse.egit-org.eclipse.egit.core.junit--sources- \
mvn-org.eclipse.egit-org.eclipse.egit.doc \
mvn-org.eclipse.egit-org.eclipse.egit.gitflow \
mvn-org.eclipse.egit-org.eclipse.egit.gitflow--sources- \
mvn-org.eclipse.egit-org.eclipse.egit.gitflow.ui \
mvn-org.eclipse.egit-org.eclipse.egit.gitflow.ui--sources- \
mvn-org.eclipse.egit-org.eclipse.egit.ui \
mvn-org.eclipse.egit-org.eclipse.egit.ui--sources- \
mvn-org.eclipse.egit.feature-org.eclipse.egit \
mvn-org.eclipse.egit.feature-org.eclipse.egit.gitflow.feature \
osgi-org.eclipse.egit \
osgi-org.eclipse.egit.core \
osgi-org.eclipse.egit.core.junit \
osgi-org.eclipse.egit.core.junit.source \
osgi-org.eclipse.egit.core.source \
osgi-org.eclipse.egit.doc \
osgi-org.eclipse.egit.gitflow \
osgi-org.eclipse.egit.gitflow.feature \
osgi-org.eclipse.egit.gitflow.source \
osgi-org.eclipse.egit.gitflow.ui \
osgi-org.eclipse.egit.gitflow.ui.source \
osgi-org.eclipse.egit.ui \
osgi-org.eclipse.egit.ui.source"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
osgi-org.eclipse.jdt.core \
osgi-org.eclipse.jdt.launching \
osgi-org.eclipse.jdt.ui \
osgi-org.eclipse.jgit \
osgi-org.eclipse.jgit.http.apache \
osgi-org.eclipse.jgit.junit \
osgi-org.eclipse.jgit.lfs \
osgi-org.eclipse.jgit.ssh.apache \
osgi-org.junit"

inherit rpm
