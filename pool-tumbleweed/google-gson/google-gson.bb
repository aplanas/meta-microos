SUMMARY = "Java lib for conversion of Java objects into JSON representation"
DESCRIPTION = "Gson is a Java library that can be used to convert a Java object into its \
JSON representation. It can also be used to convert a JSON string into an \
equivalent Java object. Gson can work with arbitrary Java objects including \
pre-existing objects that you do not have source-code of."
LICENSE = "Apache-2.0"

PV = "2.8.9"

RPM_NAME = "google-gson-2.8.9-5.1.noarch.rpm"
RPM_HASH = "40da5f48ec1bf2fa6bdbf1e73fdfbbbb9066ba8a76c542c87e7ba6adf5209ff129583bc3cdeb56d0a4ccbef78c1520dad17003fd9ae15818d9c0e185ac7bcee8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-gson \
mvn-com.google.code.gson-gson \
mvn-com.google.code.gson-gson-extras \
mvn-com.google.code.gson-gson-extras-pom- \
mvn-com.google.code.gson-gson-parent-pom- \
mvn-com.google.code.gson-gson-pom- \
osgi-com.google.gson"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.annotation-jsr250-api"

inherit rpm
