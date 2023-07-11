SUMMARY = "Source generator library for Java"
DESCRIPTION = "This project is a fork of Sun's (now Oracle's) com.sun.codemodel project. We \
decided to fork the project because by all evidence, the upstream project is \
dead and not actively accepting outside contribution. All JBoss projects are \
urged to use this project instead for source code generation."
LICENSE = "Apache-2.0"

PV = "2.0.3"

RPM_NAME = "jdeparser-2.0.3-1.19.noarch.rpm"
RPM_HASH = "f1dec3a30d3491353ed6598054ca4132258f4776ee75728fde1f2f0aa32693b4b19cdb51ed6fbbd71669da2a3c3fb1a8aa8cc6a64274eb5bf5e02f407d473699"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jdeparser \
mvn-org.jboss.jdeparser-jdeparser \
mvn-org.jboss.jdeparser-jdeparser-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
