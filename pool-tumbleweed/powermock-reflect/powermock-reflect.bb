SUMMARY = "Reflection module of PowerMock"
DESCRIPTION = " \
PowerMock is a framework that extend other mock libraries \
such as EasyMock with more powerful capabilities. PowerMock uses a \
custom classloader and bytecode manipulation to enable mocking of \
static methods, constructors, final classes and methods, private \
methods, removal of static initializers and more. \
 \
This package contains the reflection module of PowerMock."
LICENSE = "Apache-2.0"

PV = "1.6.5"

RPM_NAME = "powermock-reflect-1.6.5-5.1.noarch.rpm"
RPM_HASH = "649f67900448eb326bb8e7c5cc67c5bc29b7c87e46db26ff9efc38652d02df0fa8b615f2e567f7263ddf07f2b1aecfb608e5b3cf92c18ff6db787223874daca0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.powermock-powermock-reflect \
mvn-org.powermock-powermock-reflect-pom- \
osgi-org.powermock.powermock-reflect \
powermock-reflect"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.objenesis-objenesis \
powermock-common"

inherit rpm
