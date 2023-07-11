SUMMARY = "JDBC DataSources/Resource Pools"
DESCRIPTION = "c3p0 is a library for augmenting traditional (DriverManager-based) \
JDBC drivers with JNDI-bindable DataSources, including DataSources \
that implement Connection and Statement Pooling, as described by the \
jdbc3 spec and jdbc2 standard extension."
LICENSE = "LGPL-2.0-or-later"

PV = "0.9.5.5"

RPM_NAME = "c3p0-0.9.5.5-4.9.noarch.rpm"
RPM_HASH = "52e7c5383ae18ca7d0290216cd71b489a22fe67cda78a53c90e38a953da3d388e55958cb7d90add27fdf4f531ddd8744c153a3562c42602d6bea381e79a54277"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "c3p0 \
hibernate-jdbc-cache \
mvn-c3p0-c3p0 \
mvn-c3p0-c3p0-pom- \
mvn-com.mchange-c3p0 \
mvn-com.mchange-c3p0-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
mchange-commons \
mvn-com.mchange-mchange-commons-java \
update-alternatives"

inherit rpm
