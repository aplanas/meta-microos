SUMMARY = "Java source code checker"
DESCRIPTION = "A tool for checking Java source code for adherence to a set of rules."
LICENSE = "LGPL-2.1-or-later"

PV = "8.0"

RPM_NAME = "checkstyle-8.0-4.11.noarch.rpm"
RPM_HASH = "59e3c602f22667916bc0418dd7b83722e41d859cf9cbbd35549ee401d73ee888aba9f4591ae4b312321c42d021c0f907b88350cd1c903daa57e859c345a54dde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "checkstyle \
config-checkstyle \
mvn-com.puppycrawl.tools-checkstyle \
mvn-com.puppycrawl.tools-checkstyle-pom-"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-antlr-antlr \
mvn-com.google.guava-guava \
mvn-commons-beanutils-commons-beanutils \
mvn-commons-cli-commons-cli \
mvn-javax.xml.bind-jaxb-api \
mvn-org.antlr-antlr4-runtime"

inherit rpm
