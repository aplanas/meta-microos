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

RPM_NAME = "powermock-reflect-1.6.5-4.10.noarch.rpm"
RPM_HASH = "177d2844f840c928f42997afaae41bafa957f566c10ebf60f4efbff0972dba604fba4827cfdbb77dd20db87e09a000dcae4eab181e41a968233eb19928e74d97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.powermock:powermock-reflect) \
mvn(org.powermock:powermock-reflect:pom:) \
osgi(org.powermock.powermock-reflect) \
powermock-reflect"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.objenesis:objenesis) \
powermock-common"

inherit rpm
