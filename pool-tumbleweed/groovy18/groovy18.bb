SUMMARY = "Dynamic language for the Java Platform"
DESCRIPTION = "Groovy is an agile and dynamic language for the Java Virtual Machine, \
built upon Java with features inspired by languages like Python, Ruby and \
Smalltalk.  It seamlessly integrates with all existing Java objects and \
libraries and compiles straight to Java byte-code so you can use it anywhere \
you can use Java."
LICENSE = "Apache-2.0"

PV = "1.8.9"

RPM_NAME = "groovy18-1.8.9-7.7.noarch.rpm"
RPM_HASH = "c4c776bba5d9c599bab578d9f719334369d3183f3a504db84de150e3a55890837024e1a2863b34a9e49d19e62dd81de374347eea2d51b68a34ad1d0a60cae1a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-groovy18 \
groovy18"

RDEPENDS:${PN} += "/usr/bin/sh \
glassfish-jsp-api \
glassfish-servlet-api \
groovy18-lib \
mvn-bsf-bsf \
mvn-com.thoughtworks.xstream-xstream \
mvn-commons-cli-commons-cli \
mvn-commons-logging-commons-logging \
mvn-jline-jline \
mvn-junit-junit \
mvn-org.apache.ant-ant \
mvn-org.apache.ant-ant-antlr \
mvn-org.apache.ant-ant-junit \
mvn-org.apache.ant-ant-launcher \
mvn-org.apache.ivy-ivy \
mvn-org.fusesource.jansi-jansi"

inherit rpm
