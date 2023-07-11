SUMMARY = "Object Graph Navigation Library"
DESCRIPTION = "OGNL is an expression language for getting and setting properties of \
Java objects, plus other extras such as list projection and selection \
and lambda expressions."
LICENSE = "Apache-2.0"

PV = "4.0~20191021git51cf8f4"

RPM_NAME = "apache-commons-ognl-4.0~20191021git51cf8f4-4.5.noarch.rpm"
RPM_HASH = "9c364676e03086e0d157c26133bae8a9e36bc147f32d9153c36bbd2e0cc1b3d5f52c898470a747bddb992679e17dccc9c90db9d0fd65883bd99f609f4cc75ab4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-ognl \
mvn-org.apache.commons-commons-ognl \
mvn-org.apache.commons-commons-ognl-pom- \
osgi-org.apache.commons.commons-ognl"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.javassist-javassist"

inherit rpm
