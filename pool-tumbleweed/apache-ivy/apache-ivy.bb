SUMMARY = "Java-based dependency manager"
DESCRIPTION = "Apache Ivy is a tool for managing (recording, tracking, resolving and \
reporting) project dependencies.  It is designed as process agnostic and is \
not tied to any methodology or structure. while available as a standalone \
tool, Apache Ivy works particularly well with Apache Ant providing a number \
of powerful Ant tasks ranging from dependency resolution to dependency \
reporting and publication."
LICENSE = "Apache-2.0"

PV = "2.5.1"

RPM_NAME = "apache-ivy-2.5.1-1.3.noarch.rpm"
RPM_HASH = "5f70df020b7112682f28ba7a92747a0d5c2221af23d1abb57e3c263c783ad76455dfd2b9f4ef0a4c3f39c5bee809b5cea0f7fd585246e0f426e41f1bde69a4e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-ivy \
config-apache-ivy \
ivy \
mvn-org.apache.ivy-ivy \
mvn-org.apache.ivy-ivy-pom- \
osgi-org.apache.ivy"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem"

inherit rpm
