SUMMARY = "CouchDB Java API"
DESCRIPTION = "LightCouch is a Java API for communicating with CouchDB database. \
It aims at providing a flexible and easy-to-use APIs with minimal \
code-base and dependency."
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "lightcouch-0.2.0-1.8.noarch.rpm"
RPM_HASH = "aed51bb9e67a5e5f3d2f5c8dd450eaf26256538a5fbc967277e19f1abf90386bb304017c9d7865ab0cc7e66663ed83dc943b5508be2a53f751c1395cd5705ad3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lightcouch \
mvn-org.lightcouch-lightcouch \
mvn-org.lightcouch-lightcouch-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.code.gson-gson \
mvn-org.apache.httpcomponents-httpclient"

inherit rpm
