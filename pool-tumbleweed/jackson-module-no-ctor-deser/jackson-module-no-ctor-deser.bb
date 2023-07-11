SUMMARY = "Support deserialization of POJO classes without default constructor"
DESCRIPTION = "Module that allows instantiation of Java POJOs that do not have 'default constructor' \
(constructor that takes no arguments) but should be deserialized from JSON Object \
as POJOs. In such cases, module tries to use sun.reflect.ReflectionFactory \
to force instantiation that by-passes all constructors (it is the mechanism used by \
JDK serialization system)."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-module-no-ctor-deser-2.13.3-1.8.noarch.rpm"
RPM_HASH = "dbff7492af7e24b72c0a26fe8e0d97f91919c26173c607909d27de38db683a5f1a2c147585ce22acc83ae79e4f1609f3554f067042f84fdbe130ce3a7f89cd8b"
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
