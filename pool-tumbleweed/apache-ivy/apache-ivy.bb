SUMMARY = "Java-based dependency manager"
DESCRIPTION = "Apache Ivy is a tool for managing (recording, tracking, resolving and \
reporting) project dependencies.  It is designed as process agnostic and is \
not tied to any methodology or structure. while available as a standalone \
tool, Apache Ivy works particularly well with Apache Ant providing a number \
of powerful Ant tasks ranging from dependency resolution to dependency \
reporting and publication."
LICENSE = "Apache-2.0"

PV = "2.5.2"

RPM_NAME = "apache-ivy-2.5.2-1.1.noarch.rpm"
RPM_HASH = "7d3306ed42e02a780ccee5961a6f64416cf80d52d6d73a357ef5c5691a20486f164dc763a410abd66123f334e4d728c8f2064ef5432fe1a7fc0ee8de104d5c5b"
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
