SUMMARY = "HyperSQL Database Engine"
DESCRIPTION = "HSQLdb is a relational database engine written in JavaTM , with a JDBC \
driver, supporting a subset of ANSI-92 SQL. It offers a small (about \
100k), fast database engine which offers both in memory and disk based \
tables. Embedded and server modes are available. Additionally, it \
includes tools such as a minimal web server, in-memory query and \
management tools (can be run as applets or servlets, too) and a number \
of demonstration examples. \
 \
Downloaded code should be regarded as being of production quality. The \
product is currently being used as a database and persistence engine in \
many Open Source Software projects and even in commercial projects and \
products! In it's current version it is extremely stable and reliable. \
It is best known for its small size, ability to execute completely in \
memory and its speed. Yet it is a completely functional relational \
database management system that is completely free under the Modified \
BSD License. Yes, that's right, completely free of cost or \
restrictions!"
LICENSE = "BSD-3-Clause"

PV = "2.7.2"

RPM_NAME = "hsqldb-2.7.2-1.1.noarch.rpm"
RPM_HASH = "1dd0f13c212d840df62530c81b5d1c464adaf8b0cdd31878f83512e973d4cd42d9e4469d56a461080861c8e7516ccd08f764fc8460efe77138319f285563a656"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-hsqldb \
hsqldb \
mvn-org.hsqldb-hsqldb \
mvn-org.hsqldb-hsqldb-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
java \
java-headless \
javapackages-filesystem \
servletapi5 \
systemd"

inherit rpm
