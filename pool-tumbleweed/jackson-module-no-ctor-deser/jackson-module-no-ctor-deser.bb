SUMMARY = "Support deserialization of POJO classes without default constructor"
DESCRIPTION = "Module that allows instantiation of Java POJOs that do not have 'default constructor' \
(constructor that takes no arguments) but should be deserialized from JSON Object \
as POJOs. In such cases, module tries to use sun.reflect.ReflectionFactory \
to force instantiation that by-passes all constructors (it is the mechanism used by \
JDK serialization system)."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-module-no-ctor-deser-2.15.2-1.1.noarch.rpm"
RPM_HASH = "963e10e95ced14dd7d7026a45d3104a86cdc7ac9322dc4a147f80b94b9c94743075dea4807b63c0e578ba64b43fc78a1cb29424fed922d7adb82995e59a909b3"
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
