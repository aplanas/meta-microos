SUMMARY = "Scala Maven Plugin"
DESCRIPTION = "The scala-maven-plugin (previously maven-scala-plugin) is \
used for compiling/testing/running/documenting scala code \
of any maven project."
LICENSE = "SUSE-Public-Domain"

PV = "3.4.6"

RPM_NAME = "scala-maven-plugin-3.4.6-3.9.noarch.rpm"
RPM_HASH = "a65f198f7ee7c51954b126636feb69fa2232aabe43531d954af42c82d5e3ba89d3914e388ec33c008f4bb046eef84eb4949f5b2b05fd1dfae2412176d17ba950"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-net.alchim31.maven-scala-maven-plugin \
mvn-net.alchim31.maven-scala-maven-plugin-pom- \
scala-maven-plugin"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.typesafe.zinc-zinc \
mvn-org.apache.commons-commons-exec \
mvn-org.apache.maven-maven-archiver \
mvn-org.apache.maven-maven-compat \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-model \
mvn-org.apache.maven-maven-project \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.apache.maven.reporting-maven-reporting-api \
mvn-org.apache.maven.shared-maven-dependency-tree \
mvn-org.apache.maven.shared-maven-invoker \
mvn-org.codehaus.plexus-plexus-archiver \
mvn-org.codehaus.plexus-plexus-classworlds \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.scala-sbt-compile"

inherit rpm
