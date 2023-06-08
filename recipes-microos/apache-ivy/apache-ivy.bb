SUMMARY = "Java-based dependency manager"
DESCRIPTION = "Apache Ivy is a tool for managing (recording, tracking, resolving and \
reporting) project dependencies.  It is designed as process agnostic and is \
not tied to any methodology or structure. while available as a standalone \
tool, Apache Ivy works particularly well with Apache Ant providing a number \
of powerful Ant tasks ranging from dependency resolution to dependency \
reporting and publication."
LICENSE = "Apache-2.0"

PV = "2.5.1"

RPM_NAME = "apache-ivy-2.5.1-1.2.noarch.rpm"
RPM_HASH = "e2c7dc2063a33bcb13f672a2cadbb9f7ac8e5ca436652b28cda8aabfb37af7d0fc25ab13b139e1af9113365739f17c5c4aab3254394aa9351fdd917cecd37065"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-ivy config(apache-ivy) ivy mvn(org.apache.ivy:ivy) mvn(org.apache.ivy:ivy:pom:) osgi(org.apache.ivy)"
RDEPENDS:${PN} += "/bin/bash java-headless javapackages-filesystem"

inherit rpm
