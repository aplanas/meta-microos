SUMMARY = "Java framework for parsing command line parameters"
DESCRIPTION = "JCommander is a Java framework that allows parsing command line \
parameters (with annotations)."
LICENSE = "Apache-2.0"

PV = "1.82"

RPM_NAME = "beust-jcommander-1.82-1.1.noarch.rpm"
RPM_HASH = "19319c6137e6517450e47ad418ae6e84c079501ce50eb6f2405b1565e177e1257810de6a863115ded9a80717b78c6a0246dd0e05e88b8aab0f29934e0b5009ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "beust-jcommander \
jcommander \
mvn(com.beust:jcommander) \
mvn(com.beust:jcommander:pom:) \
osgi(com.beust.jcommander)"
RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem"

inherit rpm
