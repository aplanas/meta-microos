SUMMARY = "Core module of PowerMock"
DESCRIPTION = " \
PowerMock is a framework that extend other mock libraries \
such as EasyMock with more powerful capabilities. PowerMock uses a \
custom classloader and bytecode manipulation to enable mocking of \
static methods, constructors, final classes and methods, private \
methods, removal of static initializers and more. \
 \
This package contains the core module of PowerMock."
LICENSE = "Apache-2.0"

PV = "1.6.5"

RPM_NAME = "powermock-core-1.6.5-5.1.noarch.rpm"
RPM_HASH = "54f0180676c512134266098570a7ff21cec2ea99f16dfa287cc3dad62f7c3c6be3bb15a26a5d1f2c2f0ff8d60557975216550f529bd162c6aef9c58d05d15f76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.powermock-powermock-classloading-base \
mvn-org.powermock-powermock-classloading-base-pom- \
mvn-org.powermock-powermock-classloading-objenesis \
mvn-org.powermock-powermock-classloading-objenesis-pom- \
mvn-org.powermock-powermock-core \
mvn-org.powermock-powermock-core-pom- \
osgi-org.powermock.powermock-classloading-base \
osgi-org.powermock.powermock-classloading-objenesis \
osgi-org.powermock.powermock-core \
powermock-core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.javassist-javassist \
mvn-org.powermock-powermock-api-support \
mvn-org.powermock-powermock-reflect \
powermock-common"

inherit rpm
