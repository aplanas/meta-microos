SUMMARY = "Build Number Maven Plugin"
DESCRIPTION = "This mojo is designed to get a unique build number for each time you build \
your project. So while your version may remain constant at 1.0-SNAPSHOT \
for many iterations until release, you will have a build number that can \
uniquely identify each build during that time. The build number is obtained \
from scm, and in particular, at this time, from svn. You can then place that \
build number in metadata, which can be accessed from your app, if desired. \
 \
The mojo also has a couple of extra functions to ensure you get the proper \
build number. First, your local repository is checked to make sure it is \
up to date. Second, your local repository is automatically updated, so that \
you get the latest build number. Both these functions can be suppressed, \
if desired. \
 \
Optionally, you can configure this mojo to produce a revision based on a \
timestamp, or on a sequence, without requiring any interaction with an \
SCM system. Note that currently, the only supported SCM is subversion."
LICENSE = "Apache-2.0 & MIT"

PV = "1.3"

RPM_NAME = "buildnumber-maven-plugin-1.3-2.10.noarch.rpm"
RPM_HASH = "26066ab4e960db9197ccede1bf9faaa10add52982a768dc207a8f3cb6daa151779f941d150a1cbcd08f614afe187c4a5c9fe62e4717e22125dc3072f985af001"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "buildnumber-maven-plugin \
mvn(org.codehaus.mojo:buildnumber-maven-plugin) \
mvn(org.codehaus.mojo:buildnumber-maven-plugin:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(net.java.dev.jna:jna) \
mvn(org.apache.maven.scm:maven-scm-api) \
mvn(org.apache.maven.scm:maven-scm-manager-plexus) \
mvn(org.apache.maven.scm:maven-scm-provider-bazaar) \
mvn(org.apache.maven.scm:maven-scm-provider-clearcase) \
mvn(org.apache.maven.scm:maven-scm-provider-cvsexe) \
mvn(org.apache.maven.scm:maven-scm-provider-gitexe) \
mvn(org.apache.maven.scm:maven-scm-provider-hg) \
mvn(org.apache.maven.scm:maven-scm-provider-perforce) \
mvn(org.apache.maven.scm:maven-scm-provider-starteam) \
mvn(org.apache.maven.scm:maven-scm-provider-svn-commons) \
mvn(org.apache.maven.scm:maven-scm-provider-svnexe) \
mvn(org.apache.maven:maven-core) \
mvn(org.apache.maven:maven-plugin-api) \
mvn(org.apache.maven:maven-project) \
mvn(org.apache.maven:maven-settings:2.0.6) \
mvn(org.codehaus.plexus:plexus-container-default) \
mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
