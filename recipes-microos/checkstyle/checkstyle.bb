SUMMARY = "Java source code checker"
DESCRIPTION = "A tool for checking Java source code for adherence to a set of rules."
LICENSE = "LGPL-2.1-or-later"

PV = "8.0"

RPM_NAME = "checkstyle-8.0-4.10.noarch.rpm"
RPM_HASH = "e6a80daa66b9208b7f4e92340ad6df6d30dd2d6e16c6f2f588c05a2644f492daf9928bb1f84b8e74ff8fe855c9facd57f98565c73dd7d09e98a585a3ff6c92af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "checkstyle config(checkstyle) mvn(com.puppycrawl.tools:checkstyle) mvn(com.puppycrawl.tools:checkstyle:pom:)"
RDEPENDS:${PN} += "/bin/bash /bin/sh java-headless javapackages-filesystem javapackages-tools mvn(antlr:antlr) mvn(com.google.guava:guava) mvn(commons-beanutils:commons-beanutils) mvn(commons-cli:commons-cli) mvn(javax.xml.bind:jaxb-api) mvn(org.antlr:antlr4-runtime)"

inherit rpm
