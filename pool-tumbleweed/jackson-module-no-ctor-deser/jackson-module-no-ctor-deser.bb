SUMMARY = "Support deserialization of POJO classes without default constructor"
DESCRIPTION = "Module that allows instantiation of Java POJOs that do not have 'default constructor' \
(constructor that takes no arguments) but should be deserialized from JSON Object \
as POJOs. In such cases, module tries to use sun.reflect.ReflectionFactory \
to force instantiation that by-passes all constructors (it is the mechanism used by \
JDK serialization system)."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-module-no-ctor-deser-2.15.2-2.1.noarch.rpm"
RPM_HASH = "eb99908e7de620608656f7158415953d1f21453ab77cba48f49fe65f979773daea4198607c8ef86b1aaf45109e0158e25dd5d67ed548b8e3902ce81d3ab4583d"
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
