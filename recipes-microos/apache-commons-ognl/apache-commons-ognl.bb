SUMMARY = "Object Graph Navigation Library"
DESCRIPTION = "OGNL is an expression language for getting and setting properties of \
Java objects, plus other extras such as list projection and selection \
and lambda expressions."
LICENSE = "Apache-2.0"

PV = "4.0~20191021git51cf8f4"

RPM_NAME = "apache-commons-ognl-4.0~20191021git51cf8f4-4.4.noarch.rpm"
RPM_HASH = "b303c761233f736b9c9deac351b38a7cfea5698f4caa890f6beb606bc7a3ca252964eac1d6d1391d26b3f9eae2c705db0a698a36526cd77508049fbc908bcda1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-ognl \
mvn(org.apache.commons:commons-ognl) \
mvn(org.apache.commons:commons-ognl:pom:) \
osgi(org.apache.commons.commons-ognl)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.javassist:javassist)"

inherit rpm
