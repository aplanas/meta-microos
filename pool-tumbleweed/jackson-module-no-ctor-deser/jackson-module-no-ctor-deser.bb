SUMMARY = "Support deserialization of POJO classes without default constructor"
DESCRIPTION = "Module that allows instantiation of Java POJOs that do not have 'default constructor' \
(constructor that takes no arguments) but should be deserialized from JSON Object \
as POJOs. In such cases, module tries to use sun.reflect.ReflectionFactory \
to force instantiation that by-passes all constructors (it is the mechanism used by \
JDK serialization system)."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-module-no-ctor-deser-2.13.3-1.7.noarch.rpm"
RPM_HASH = "0e4f387b8e2d02a37e16086f87814e111c653ffe1a49cb7f0879dfd5a73d4a91db6477828f1a1b7dc520a963ac0d781f37ca643646969c8934b0a84b7ba9058a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-module-no-ctor-deser \
mvn-com.fasterxml.jackson.module-jackson-module-no-ctor-deser \
mvn-com.fasterxml.jackson.module-jackson-module-no-ctor-deser-pom- \
osgi-com.fasterxml.jackson.module.jackson-module-no-ctor-deser"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind"

inherit rpm
