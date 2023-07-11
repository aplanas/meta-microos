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

RPM_NAME = "powermock-core-1.6.5-4.11.noarch.rpm"
RPM_HASH = "25e6ad3052c17658fb1febf063036decbd8fa37b55a682eff886ee1facd196acc1982278d64004623dbe98d625c2061e683dae176675b5057ca521fbb9342fe7"
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
