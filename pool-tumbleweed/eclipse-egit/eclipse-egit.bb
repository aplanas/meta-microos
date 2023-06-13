SUMMARY = "Eclipse Git Integration"
DESCRIPTION = "The eclipse-egit package contains Eclipse plugins for \
interacting with Git repositories."
LICENSE = "EPL-2.0"

PV = "5.11.0"

RPM_NAME = "eclipse-egit-5.11.0-3.5.noarch.rpm"
RPM_HASH = "e9d35a49af6571941646df940d5b9784f3b84ab441132f9fcc4e7d1e34fa15349ad111273253ddfc95c90df909b5948ffb5341fb318f6f41498f2e9866bfd5cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eclipse-egit \
mvn(org.eclipse.egit.feature:org.eclipse.egit) \
mvn(org.eclipse.egit.feature:org.eclipse.egit.gitflow.feature) \
mvn(org.eclipse.egit:org.eclipse.egit) \
mvn(org.eclipse.egit:org.eclipse.egit.core) \
mvn(org.eclipse.egit:org.eclipse.egit.core.junit) \
mvn(org.eclipse.egit:org.eclipse.egit.core.junit::sources:) \
mvn(org.eclipse.egit:org.eclipse.egit.core::sources:) \
mvn(org.eclipse.egit:org.eclipse.egit.doc) \
mvn(org.eclipse.egit:org.eclipse.egit.gitflow) \
mvn(org.eclipse.egit:org.eclipse.egit.gitflow.ui) \
mvn(org.eclipse.egit:org.eclipse.egit.gitflow.ui::sources:) \
mvn(org.eclipse.egit:org.eclipse.egit.gitflow::sources:) \
mvn(org.eclipse.egit:org.eclipse.egit.ui) \
mvn(org.eclipse.egit:org.eclipse.egit.ui::sources:) \
osgi(org.eclipse.egit) \
osgi(org.eclipse.egit.core) \
osgi(org.eclipse.egit.core.junit) \
osgi(org.eclipse.egit.core.junit.source) \
osgi(org.eclipse.egit.core.source) \
osgi(org.eclipse.egit.doc) \
osgi(org.eclipse.egit.gitflow) \
osgi(org.eclipse.egit.gitflow.feature) \
osgi(org.eclipse.egit.gitflow.source) \
osgi(org.eclipse.egit.gitflow.ui) \
osgi(org.eclipse.egit.gitflow.ui.source) \
osgi(org.eclipse.egit.ui) \
osgi(org.eclipse.egit.ui.source)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
osgi(org.eclipse.jdt.core) \
osgi(org.eclipse.jdt.launching) \
osgi(org.eclipse.jdt.ui) \
osgi(org.eclipse.jgit) \
osgi(org.eclipse.jgit.http.apache) \
osgi(org.eclipse.jgit.junit) \
osgi(org.eclipse.jgit.lfs) \
osgi(org.eclipse.jgit.ssh.apache) \
osgi(org.junit)"

inherit rpm
