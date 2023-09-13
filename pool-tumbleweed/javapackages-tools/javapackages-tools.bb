SUMMARY = "Macros and scripts for Java packaging support"
DESCRIPTION = "This package provides macros and scripts to support Java packaging."
LICENSE = "BSD-3-Clause"

PV = "6.2.0"

RPM_NAME = "javapackages-tools-6.2.0-2.1.aarch64.rpm"
RPM_HASH = "e2b31d0bbcf21f90f1cce1bc6add35ec33f2c867c3c00e6aecd8a8b63199558fb7cb14e7f7218af442ab6362be4511a57ab8bc3e612fb788db55d59cf6cfc9b0"

RPROVIDES:${PN} += "config-javapackages-tools \
javapackages-tools \
jpackage-utils \
rpm-macro-ant \
rpm-macro-jar \
rpm-macro-java \
rpm-macro-java-home \
rpm-macro-javac \
rpm-macro-javadoc \
rpm-macro-jpackage-script"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
