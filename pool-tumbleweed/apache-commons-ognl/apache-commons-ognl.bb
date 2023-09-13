SUMMARY = "Object Graph Navigation Library"
DESCRIPTION = "OGNL is an expression language for getting and setting properties of \
Java objects, plus other extras such as list projection and selection \
and lambda expressions."
LICENSE = "Apache-2.0"

PV = "4.0~20191021git51cf8f4"

RPM_NAME = "apache-commons-ognl-4.0~20191021git51cf8f4-5.1.noarch.rpm"
RPM_HASH = "1fd01703d0c581f053ebb91729b6e89d47be6c23558ed083c9935365095b1259c0962b3d266e7c68f48b74bcc98e8e789ee7ef6b09a5448579eef89d6297f509"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-ognl \
mvn-org.apache.commons-commons-ognl \
mvn-org.apache.commons-commons-ognl-pom- \
osgi-org.apache.commons.commons-ognl"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.javassist-javassist"

inherit rpm
