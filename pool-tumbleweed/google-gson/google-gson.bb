SUMMARY = "Java lib for conversion of Java objects into JSON representation"
DESCRIPTION = "Gson is a Java library that can be used to convert a Java object into its \
JSON representation. It can also be used to convert a JSON string into an \
equivalent Java object. Gson can work with arbitrary Java objects including \
pre-existing objects that you do not have source-code of."
LICENSE = "Apache-2.0"

PV = "2.8.9"

RPM_NAME = "google-gson-2.8.9-4.9.noarch.rpm"
RPM_HASH = "3111bfc2e8c0e29fd1dfc31f94b649d44cc9e3266dedda5601fd4f02fc4a4671dd52e11921e856b1ea13dfeb897ab3ace9636474b0e32e694c7d158c3fcec588"
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
