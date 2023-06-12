SUMMARY = "JDBC DataSources/Resource Pools"
DESCRIPTION = "c3p0 is a library for augmenting traditional (DriverManager-based) \
JDBC drivers with JNDI-bindable DataSources, including DataSources \
that implement Connection and Statement Pooling, as described by the \
jdbc3 spec and jdbc2 standard extension."
LICENSE = "LGPL-2.0-or-later"

PV = "0.9.5.5"

RPM_NAME = "c3p0-0.9.5.5-4.8.noarch.rpm"
RPM_HASH = "88bbffa0232a87d9bc41c7483460c6a6c4b33b23ab51ad6e46c1fce73f5705cf3068a461cca6e6332cd2b428dcb447c5225b5292df58e9b3d1e7b6742abe4b38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "c3p0 \
hibernate_jdbc_cache \
mvn(c3p0:c3p0) \
mvn(c3p0:c3p0:pom:) \
mvn(com.mchange:c3p0) \
mvn(com.mchange:c3p0:pom:)"
RDEPENDS:${PN} += "/bin/sh \
java-headless \
javapackages-filesystem \
mchange-commons \
mvn(com.mchange:mchange-commons-java) \
update-alternatives"

inherit rpm
