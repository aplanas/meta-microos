SUMMARY = "Java lib for conversion of Java objects into JSON representation"
DESCRIPTION = "Gson is a Java library that can be used to convert a Java object into its \
JSON representation. It can also be used to convert a JSON string into an \
equivalent Java object. Gson can work with arbitrary Java objects including \
pre-existing objects that you do not have source-code of."
LICENSE = "Apache-2.0"

PV = "2.8.9"

RPM_NAME = "google-gson-2.8.9-4.8.noarch.rpm"
RPM_HASH = "87402bf79be3e03e7368846b4fd1f1cb4411649070872649e0581894a64b091ddd9f1ff86eb498677cd6ad9c1ca92d2b370ce34cc7a5592cc014c8b41359f3a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-gson \
mvn(com.google.code.gson:gson) \
mvn(com.google.code.gson:gson-extras) \
mvn(com.google.code.gson:gson-extras:pom:) \
mvn(com.google.code.gson:gson-parent:pom:) \
mvn(com.google.code.gson:gson:pom:) \
osgi(com.google.gson)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(javax.annotation:jsr250-api)"

inherit rpm
