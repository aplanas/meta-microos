SUMMARY = "CouchDB Java API"
DESCRIPTION = "LightCouch is a Java API for communicating with CouchDB database. \
It aims at providing a flexible and easy-to-use APIs with minimal \
code-base and dependency."
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "lightcouch-0.2.0-1.7.noarch.rpm"
RPM_HASH = "46055fbfa4819fc9e1de41698c5657baf81f5cd9df0c26bece80fe1f16405d780d1e21dbccae7a6469cf77ec600f6f801b915b3a780a046785b9794c59466889"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lightcouch \
mvn(org.lightcouch:lightcouch) \
mvn(org.lightcouch:lightcouch:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.google.code.gson:gson) \
mvn(org.apache.httpcomponents:httpclient)"

inherit rpm
