SUMMARY = "Macros and scripts for Java packaging support"
DESCRIPTION = "This package provides macros and scripts to support Java packaging."
LICENSE = "BSD-3-Clause"

PV = "6.1.0"

RPM_NAME = "javapackages-tools-6.1.0-4.1.aarch64.rpm"
RPM_HASH = "90bd6b8403693d9a0117b4c971a7490df8392180891d6c886e0bd47b2d7f176d66bb040d715f9774e41822a6a1aabacb8d1b7b291602cdccac04c4f397be581d"

RPROVIDES:${PN} += "config-javapackages-tools \
javapackages-tools \
jpackage-utils \
mvn-com.sun-tools \
mvn-sun.jdk-jconsole \
rpm-macro-ant \
rpm-macro-jar \
rpm-macro-java \
rpm-macro-java-home \
rpm-macro-javac \
rpm-macro-javadoc \
rpm-macro-jpackage-script"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
