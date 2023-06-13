SUMMARY = "Common API for doing SCM operations"
DESCRIPTION = "Maven SCM supports Maven plugins (e.g. maven-release-plugin) and other \
tools (e.g. Continuum) in providing them a common API for doing SCM operations."
LICENSE = "Apache-2.0"

PV = "1.12.0"

RPM_NAME = "maven-scm-1.12.0-3.3.noarch.rpm"
RPM_HASH = "cdad30f558b38f7fff73f6accee3706132aed431389dbbc03559300d2877dc7739b936636a2f6f09517feb135c7bfbd129a2109646a89e848497a0e15117f365"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-scm \
mvn(org.apache.maven.plugins:maven-scm-plugin) \
mvn(org.apache.maven.plugins:maven-scm-plugin:pom:) \
mvn(org.apache.maven.scm:maven-scm-api) \
mvn(org.apache.maven.scm:maven-scm-api:pom:) \
mvn(org.apache.maven.scm:maven-scm-client) \
mvn(org.apache.maven.scm:maven-scm-client:pom:) \
mvn(org.apache.maven.scm:maven-scm-manager-plexus) \
mvn(org.apache.maven.scm:maven-scm-manager-plexus:pom:) \
mvn(org.apache.maven.scm:maven-scm-managers:pom:) \
mvn(org.apache.maven.scm:maven-scm-provider-accurev) \
mvn(org.apache.maven.scm:maven-scm-provider-accurev:pom:) \
mvn(org.apache.maven.scm:maven-scm-provider-bazaar) \
mvn(org.apache.maven.scm:maven-scm-provider-bazaar:pom:) \
mvn(org.apache.maven.scm:maven-scm-provider-clearcase) \
mvn(org.apache.maven.scm:maven-scm-provider-clearcase:pom:) \
mvn(org.apache.maven.scm:maven-scm-provider-cvs-commons) \
mvn(org.apache.maven.scm:maven-scm-provider-cvs-commons:pom:) \
mvn(org.apache.maven.scm:maven-scm-provider-cvsexe) \
mvn(org.apache.maven.scm:maven-scm-provider-cvsexe:pom:) \
mvn(org.apache.maven.scm:maven-scm-provider-git-commons) \
mvn(org.apache.maven.scm:maven-scm-provider-git-commons:pom:) \
mvn(org.apache.maven.scm:maven-scm-provider-gitexe) \
mvn(org.apache.maven.scm:maven-scm-provider-gitexe:pom:) \
mvn(org.apache.maven.scm:maven-scm-provider-hg) \
mvn(org.apache.maven.scm:maven-scm-provider-hg:pom:) \
mvn(org.apache.maven.scm:maven-scm-provider-jazz) \
mvn(org.apache.maven.scm:maven-scm-provider-jazz:pom:) \
mvn(org.apache.maven.scm:maven-scm-provider-jgit) \
mvn(org.apache.maven.scm:maven-scm-provider-jgit:pom:) \
mvn(org.apache.maven.scm:maven-scm-provider-local) \
mvn(org.apache.maven.scm:maven-scm-provider-local:pom:) \
mvn(org.apache.maven.scm:maven-scm-provider-perforce) \
mvn(org.apache.maven.scm:maven-scm-provider-perforce:pom:) \
mvn(org.apache.maven.scm:maven-scm-provider-starteam) \
mvn(org.apache.maven.scm:maven-scm-provider-starteam:pom:) \
mvn(org.apache.maven.scm:maven-scm-provider-svn-commons) \
mvn(org.apache.maven.scm:maven-scm-provider-svn-commons:pom:) \
mvn(org.apache.maven.scm:maven-scm-provider-svnexe) \
mvn(org.apache.maven.scm:maven-scm-provider-svnexe:pom:) \
mvn(org.apache.maven.scm:maven-scm-provider-synergy) \
mvn(org.apache.maven.scm:maven-scm-provider-synergy:pom:) \
mvn(org.apache.maven.scm:maven-scm-provider-tfs) \
mvn(org.apache.maven.scm:maven-scm-provider-tfs:pom:) \
mvn(org.apache.maven.scm:maven-scm-provider-vss) \
mvn(org.apache.maven.scm:maven-scm-provider-vss:pom:) \
mvn(org.apache.maven.scm:maven-scm-providers-cvs:pom:) \
mvn(org.apache.maven.scm:maven-scm-providers-git:pom:) \
mvn(org.apache.maven.scm:maven-scm-providers-standard:pom:) \
mvn(org.apache.maven.scm:maven-scm-providers-svn:pom:) \
mvn(org.apache.maven.scm:maven-scm-providers:pom:) \
mvn(org.apache.maven.scm:maven-scm:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(commons-io:commons-io) \
mvn(org.apache.commons:commons-lang3) \
mvn(org.apache.maven.shared:file-management) \
mvn(org.apache.maven:maven-compat) \
mvn(org.apache.maven:maven-plugin-api) \
mvn(org.apache.maven:maven-settings:2.2.1) \
mvn(org.codehaus.plexus:plexus-container-default) \
mvn(org.codehaus.plexus:plexus-utils) \
mvn(org.eclipse.jgit:org.eclipse.jgit) \
mvn(org.eclipse.jgit:org.eclipse.jgit.ssh.jsch) \
mvn(org.sonatype.plexus:plexus-sec-dispatcher)"

inherit rpm
